package com.pf.Shopping.bean;

public class UserInfo {
    private Long userinfoId;

    private String userinfoIcard;

    private Boolean userinfoWork;

    private Boolean userinfoMarriage;

    private String userinfoSalary;

    private Long userinfoUserid;

    public Long getUserinfoId() {
        return userinfoId;
    }

    public void setUserinfoId(Long userinfoId) {
        this.userinfoId = userinfoId;
    }

    public String getUserinfoIcard() {
        return userinfoIcard;
    }

    public void setUserinfoIcard(String userinfoIcard) {
        this.userinfoIcard = userinfoIcard == null ? null : userinfoIcard.trim();
    }

    public Boolean getUserinfoWork() {
        return userinfoWork;
    }

    public void setUserinfoWork(Boolean userinfoWork) {
        this.userinfoWork = userinfoWork;
    }

    public Boolean getUserinfoMarriage() {
        return userinfoMarriage;
    }

    public void setUserinfoMarriage(Boolean userinfoMarriage) {
        this.userinfoMarriage = userinfoMarriage;
    }

    public String getUserinfoSalary() {
        return userinfoSalary;
    }

    public void setUserinfoSalary(String userinfoSalary) {
        this.userinfoSalary = userinfoSalary == null ? null : userinfoSalary.trim();
    }

    public Long getUserinfoUserid() {
        return userinfoUserid;
    }

    public void setUserinfoUserid(Long userinfoUserid) {
        this.userinfoUserid = userinfoUserid;
    }
}