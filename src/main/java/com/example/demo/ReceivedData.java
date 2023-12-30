package com.example.demo;

public class ReceivedData {
    private String receivedString;

    public ReceivedData() {
        // 默认构造函数
    }

    public ReceivedData(String receivedString) {
        this.receivedString = receivedString;
    }

    public String getReceivedString() {
        return receivedString;
    }

    public void setReceivedString(String receivedString) {
        this.receivedString = receivedString;
    }
}