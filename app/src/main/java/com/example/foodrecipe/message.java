package com.example.foodrecipe;

public class message {
    public  static String sent_by_me = "me";
    public  static String sent_by_bot ="bot";

    String message;
    String sentby;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSentby() {
        return sentby;
    }

    public void setSentby(String sentby) {
        this.sentby = sentby;
    }

    public message(String message, String sentby) {
        this.message = message;
        this.sentby = sentby;
    }
}
