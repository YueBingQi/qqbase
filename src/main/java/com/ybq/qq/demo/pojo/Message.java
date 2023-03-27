package com.ybq.qq.demo.pojo;

public class Message {
    private String mesType;
    private String sender;
    private String getter;
    private String message;

    public String getMesType() {
        return mesType;
    }

    public void setMesType(String mesType) {
        this.mesType = mesType;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getGetter() {
        return getter;
    }

    public void setGetter(String getter) {
        this.getter = getter;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Message() {
    }

    public Message(String mesType, String sender, String getter, String message) {
        this.mesType = mesType;
        this.sender = sender;
        this.getter = getter;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "mesType='" + mesType + '\'' +
                ", sender='" + sender + '\'' +
                ", getter='" + getter + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
