package com.dataapplab.spring.basic;

import com.dataapplab.spring.basic.algorithm.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @author joshuaz
 * 组装你的Application
 */
public class SpringAlgorithmApplication {
	public static void main(String[] args){
        // ask spring to initial beans !!
		// what are beans
		// what are the dependency of beans
		// where to search beans
		
		//BinarySearchImpl search = new BinarySearchImpl(new QuickSortAlgorithm());
		
		//AnnotationConfigApplicationContext
		//AnnotationConfigWebApplicationContext
		//ClassPathXmlApplicationContext 是在所有的类路径（包含JAR文件)
		//FileSystemXmlapplicationcontext 指定的文件系统路径下查找xml
		//XmlWebApplicationContext
		
		//ApplicationContext
        try(AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(AlgorithmConfig.class)){
        	
	        BinarySearchImpl search = context.getBean(BinarySearchImpl.class);
	        BinarySearchImpl altSearch = context.getBean(BinarySearchImpl.class);
	
	        System.out.println(search);
			System.out.println(altSearch);
			
	        System.out.println(search.getBubbleSortAlgorithm());
			System.out.println(altSearch.getBubbleSortAlgorithm());
			
			int result = search.binarySearch(new int[]{12,4,6, 3}, 3);
	
			System.out.println(result);
        }
		
	}
}
