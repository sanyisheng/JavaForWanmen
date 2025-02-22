package com.dataapplab.springboot.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("securityProvider")
public class SecurityProvider implements AuthenticationProvider {
    
    @Autowired
    private  UserDetailsService userDetailsService;  
    
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
	     UsernamePasswordAuthenticationToken token 
	         = (UsernamePasswordAuthenticationToken) authentication;
	     
	     String username = token.getName();
	     UserDetails userDetails = null;
	     
	     if(username !=null) {
	         userDetails = userDetailsService.loadUserByUsername(username);
	     }
	     
	     // check user detail is validate
	     if(userDetails == null) {  
	         throw new UsernameNotFoundException("用户名/密码无效");  
	     }	     
	     else if (!userDetails.isEnabled()){  
	         System.out.println("jinyong用户已被禁用");
	         throw new DisabledException("用户已被禁用");  
	     }else if (!userDetails.isAccountNonExpired()) {  
	         System.out.println("guoqi账号已过期");
	         throw new LockedException("账号已过期");  
	     }else if (!userDetails.isAccountNonLocked()) {  
	         System.out.println("suoding账号已被锁定");
	         throw new LockedException("账号已被锁定");  
	     }else if (!userDetails.isCredentialsNonExpired()) {  
	         System.out.println("pingzheng凭证已过期");
	         throw new LockedException("凭证已过期");  
	     }  
	     
	     String password = userDetails.getPassword();
	      
	     // check if the password is match
	     if(!password.equals(token.getCredentials())) {  
	         throw new BadCredentialsException("Invalid username/password");  
	     }  
	     
	     //授权  
	     return new UsernamePasswordAuthenticationToken(userDetails, password,userDetails.getAuthorities());  
	}

	@Override
	public boolean supports(Class<?> authentication) {
        //返回true后才会执行上面的authenticate方法,这步能确保authentication能正确转换类型  
       return UsernamePasswordAuthenticationToken.class.equals(authentication);  
	}
	
}
