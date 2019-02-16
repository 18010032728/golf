package com.bdqn.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class User {
    private int id;
    private Date createDate;
    private Date modifyDate;
    private String username;
    private String phone;
    private String password;
    private String realname;
    private boolean sex;
    private Date loginDate;
    private int failedCount;
    private int isLocked;
    private Date lockedDate;
    private int lockerCount;
    private int Default;

    public User(int id, String username, String phone, String password, String realname) {
        this.id = id;
        this.username = username;
        this.phone = phone;
        this.password = password;
        this.realname = realname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public int getFailedCount() {
        return failedCount;
    }

    public void setFailedCount(int failedCount) {
        this.failedCount = failedCount;
    }

    public int getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(int isLocked) {
        this.isLocked = isLocked;
    }

    public Date getLockedDate() {
        return lockedDate;
    }

    public void setLockedDate(Date lockedDate) {
        this.lockedDate = lockedDate;
    }

    public int getLockerCount() {
        return lockerCount;
    }

    public void setLockerCount(int lockerCount) {
        this.lockerCount = lockerCount;
    }

    public int getDefault() {
        return Default;
    }

    public void setDefault(int aDefault) {
        Default = aDefault;
    }

    public String getPassword() {
        return password;
    }
}
