package ru.apache_maven;

public class AppBean 
{
	private String text; 
    public AppBean(final String text) {
        this.text = text;
    } 
    public String sayHello() {
        return "Hello, " + text;
    } 
}