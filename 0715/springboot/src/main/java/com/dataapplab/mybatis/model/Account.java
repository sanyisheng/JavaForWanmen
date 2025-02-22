package com.dataapplab.mybatis.model;

import java.util.Date;

public class Account {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_id
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_name
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.avatar
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    private String avatar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.reset_token
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    private String resetToken;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.enable
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    private Boolean enable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.create_date
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.modified_date
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    private Date modifiedDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_id
     *
     * @return the value of user.user_id
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_id
     *
     * @param userId the value for user.user_id
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_name
     *
     * @return the value of user.user_name
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_name
     *
     * @param userName the value for user.user_name
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.avatar
     *
     * @return the value of user.avatar
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.avatar
     *
     * @param avatar the value for user.avatar
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.reset_token
     *
     * @return the value of user.reset_token
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    public String getResetToken() {
        return resetToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.reset_token
     *
     * @param resetToken the value for user.reset_token
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    public void setResetToken(String resetToken) {
        this.resetToken = resetToken == null ? null : resetToken.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.enable
     *
     * @return the value of user.enable
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.enable
     *
     * @param enable the value for user.enable
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.create_date
     *
     * @return the value of user.create_date
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.create_date
     *
     * @param createDate the value for user.create_date
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.modified_date
     *
     * @return the value of user.modified_date
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.modified_date
     *
     * @param modifiedDate the value for user.modified_date
     *
     * @mbg.generated Sat Jul 14 15:57:32 CST 2018
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}