package com.itheima.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private  Integer uuid;
    private String username;
    private String password;
    private String realname;
    private Integer gender;
    private Date birthday;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public String getPassWord() {
        return password;
    }

    public void setPassWord(String passWord) {
        this.password = passWord;
    }

    public String getRealName() {
        return realname;
    }

    public void setRealName(String realName) {
        this.realname = realName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "uuid=" + uuid +
                ", userName='" + username + '\'' +
                ", passWord='" + password + '\'' +
                ", realName='" + realname + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                '}';
    }
}
