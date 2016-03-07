package com.pf.Shopping.bean;

import java.util.Date;

public class User {
    private Long userId;

    private String userName;

    private String userPassword;

    private String userPhone;

    private Boolean userSex;

    private String userRealname;

    private String userEmail;

    private Integer userIntegral;

    private Byte userGrade;

    private Date userRegister;

    private Integer userBalance;

    private String userHead;

    private Boolean userRegisterResource;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Boolean getUserSex() {
        return userSex;
    }

    public void setUserSex(Boolean userSex) {
        this.userSex = userSex;
    }

    public String getUserRealname() {
        return userRealname;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname == null ? null : userRealname.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Integer getUserIntegral() {
        return userIntegral;
    }

    public void setUserIntegral(Integer userIntegral) {
        this.userIntegral = userIntegral;
    }

    public Byte getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(Byte userGrade) {
        this.userGrade = userGrade;
    }

    public Date getUserRegister() {
        return userRegister;
    }

    public void setUserRegister(Date userRegister) {
        this.userRegister = userRegister;
    }

    public Integer getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(Integer userBalance) {
        this.userBalance = userBalance;
    }

    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead == null ? null : userHead.trim();
    }

    public Boolean getUserRegisterResource() {
        return userRegisterResource;
    }

    public void setUserRegisterResource(Boolean userRegisterResource) {
        this.userRegisterResource = userRegisterResource;
    }
}