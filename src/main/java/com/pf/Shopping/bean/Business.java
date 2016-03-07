package com.pf.Shopping.bean;

import java.util.Date;

public class Business {
    private Long factoryId;

    private String factoryName;

    private String factoryLpi;

    private String factoryLpiImg;

    private String factoryLicense;

    private String factoryLicenseImg;

    private String factoryOrganization;

    private String factoryOrganizationImg;

    private String factoryProduction;

    private String factoryProductionImg;

    private String factoryScale;

    private Date factoryRegisterdate;

    private String factoryImg;

    private Date factoryCreatedate;

    public Long getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Long factoryId) {
        this.factoryId = factoryId;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName == null ? null : factoryName.trim();
    }

    public String getFactoryLpi() {
        return factoryLpi;
    }

    public void setFactoryLpi(String factoryLpi) {
        this.factoryLpi = factoryLpi == null ? null : factoryLpi.trim();
    }

    public String getFactoryLpiImg() {
        return factoryLpiImg;
    }

    public void setFactoryLpiImg(String factoryLpiImg) {
        this.factoryLpiImg = factoryLpiImg == null ? null : factoryLpiImg.trim();
    }

    public String getFactoryLicense() {
        return factoryLicense;
    }

    public void setFactoryLicense(String factoryLicense) {
        this.factoryLicense = factoryLicense == null ? null : factoryLicense.trim();
    }

    public String getFactoryLicenseImg() {
        return factoryLicenseImg;
    }

    public void setFactoryLicenseImg(String factoryLicenseImg) {
        this.factoryLicenseImg = factoryLicenseImg == null ? null : factoryLicenseImg.trim();
    }

    public String getFactoryOrganization() {
        return factoryOrganization;
    }

    public void setFactoryOrganization(String factoryOrganization) {
        this.factoryOrganization = factoryOrganization == null ? null : factoryOrganization.trim();
    }

    public String getFactoryOrganizationImg() {
        return factoryOrganizationImg;
    }

    public void setFactoryOrganizationImg(String factoryOrganizationImg) {
        this.factoryOrganizationImg = factoryOrganizationImg == null ? null : factoryOrganizationImg.trim();
    }

    public String getFactoryProduction() {
        return factoryProduction;
    }

    public void setFactoryProduction(String factoryProduction) {
        this.factoryProduction = factoryProduction == null ? null : factoryProduction.trim();
    }

    public String getFactoryProductionImg() {
        return factoryProductionImg;
    }

    public void setFactoryProductionImg(String factoryProductionImg) {
        this.factoryProductionImg = factoryProductionImg == null ? null : factoryProductionImg.trim();
    }

    public String getFactoryScale() {
        return factoryScale;
    }

    public void setFactoryScale(String factoryScale) {
        this.factoryScale = factoryScale == null ? null : factoryScale.trim();
    }

    public Date getFactoryRegisterdate() {
        return factoryRegisterdate;
    }

    public void setFactoryRegisterdate(Date factoryRegisterdate) {
        this.factoryRegisterdate = factoryRegisterdate;
    }

    public String getFactoryImg() {
        return factoryImg;
    }

    public void setFactoryImg(String factoryImg) {
        this.factoryImg = factoryImg == null ? null : factoryImg.trim();
    }

    public Date getFactoryCreatedate() {
        return factoryCreatedate;
    }

    public void setFactoryCreatedate(Date factoryCreatedate) {
        this.factoryCreatedate = factoryCreatedate;
    }
}