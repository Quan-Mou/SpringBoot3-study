package com.quan.springboot.bean;




public class App {
    private String appName;
    private String author;

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "App{" +
                "appName='" + appName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
