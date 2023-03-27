package com.ybq.qq.demo.pojo;

public class User {
    private String account;//唯一
    private String password;
    private String userName;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User() {
    }

    public User(String account, String password, String userName) {
        this.account = account;
        this.password = password;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "Account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
