package com.flash.yuvar.flashattendancesystem.Database;

public class student_registered_list {

    private String uID;
    private String name;
    private Integer count;
    private String EndDate;
    private String reason;
    private Double count1;
    private String carriedregisteredid;
    private String carriedAttendeeID;
    private Integer dup;

    public student_registered_list(){

    }

    public student_registered_list(Integer count) {
        this.count = count;
    }


    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public student_registered_list(String uID, String name) {
        this.uID = uID;
        this.name = name;
    }

    public student_registered_list(String uID, String name,Integer count) {
        this.uID = uID;
        this.name = name;
        this.count = count;
    }

    public student_registered_list(String uID, String name,Double count,String carriedregisteredid) {
        this.uID = uID;
        this.name = name;
        this.count1 = count;
        this.carriedregisteredid = carriedregisteredid;
    }

    public student_registered_list(String uID, String name,String EndDate) {
        this.uID = uID;
        this.name = name;

        this.EndDate = EndDate;
    }

    public student_registered_list(String uID, String name,String reason,Integer dup) {
        this.uID = uID;
        this.name = name;
        this.reason = reason;


    }

    public student_registered_list(String uID, String name,String EndDate,String reason) {
        this.uID = uID;
        this.name = name;
        this.reason = reason;

        this.EndDate = EndDate;
    }


    public student_registered_list(String uID, String name,String carriedregisteredid,String carriedAttendeeID,Integer dup) {
        this.uID = uID;
        this.name = name;
        this.carriedregisteredid = carriedregisteredid;
        this.carriedAttendeeID = carriedAttendeeID;
        this.dup = dup;

    }

    public String getCarriedregisteredid() {
        return carriedregisteredid;
    }

    public void setCarriedregisteredid(String carriedregisteredid) {
        this.carriedregisteredid = carriedregisteredid;
    }

    public String getCarriedAttendeeID() {
        return carriedAttendeeID;
    }

    public void setCarriedAttendeeID(String carriedAttendeeID) {
        this.carriedAttendeeID = carriedAttendeeID;
    }

    public Integer getDup() {
        return dup;
    }

    public void setDup(Integer dup) {
        this.dup = dup;
    }

    public String getReason() {
        return reason;
    }



    public void setReason(String reason) {
        this.reason = reason;
    }

    public Double getCount1() {
        return count1;
    }

    public void setCount1(Double count1) {
        this.count1 = count1;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public String getuID() {
        return uID;
    }

    public void setuID(String uID) {
        this.uID = uID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
