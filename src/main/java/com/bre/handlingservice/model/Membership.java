package com.bre.handlingservice.model;

import java.util.Date;

public class Membership extends Product{

    private String membershipName;

    private boolean isActivated;

    public boolean isUpgraded() {
        return isUpgraded;
    }

    public void setUpgraded(boolean upgraded) {
        isUpgraded = upgraded;
    }

    private boolean isUpgraded;

    public String getMembershipName() {
        return membershipName;
    }

    public void setMembershipName(String membershipName) {
        this.membershipName = membershipName;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    private Date startDate;

    private Date endDate;

    public Membership(String productName, ProductType productType,Date startDate,Date endDate,String membershipName) {
        super(productName, productType);
        this.startDate = startDate;
        this.endDate = endDate;
        this.isActivated = true;
        this.membershipName = membershipName;
    }
}
