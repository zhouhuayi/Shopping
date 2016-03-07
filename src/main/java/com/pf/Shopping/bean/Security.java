package com.pf.Shopping.bean;

public class Security {
    private Long securityId;

    private String securityQuestion;

    private String securityAnswer;

    private Long securityUserid;

    public Long getSecurityId() {
        return securityId;
    }

    public void setSecurityId(Long securityId) {
        this.securityId = securityId;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion == null ? null : securityQuestion.trim();
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer == null ? null : securityAnswer.trim();
    }

    public Long getSecurityUserid() {
        return securityUserid;
    }

    public void setSecurityUserid(Long securityUserid) {
        this.securityUserid = securityUserid;
    }
}