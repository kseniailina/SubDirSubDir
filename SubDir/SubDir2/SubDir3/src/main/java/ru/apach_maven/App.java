package ru.apache_maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(new AppBean("Maven").sayHello());
        //add new row to test
        System.out.println( "It's me!" );
    }
}