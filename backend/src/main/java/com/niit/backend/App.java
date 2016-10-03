package com.niit.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
      AnnotationConfigApplicationContext appobj =new AnnotationConfigApplicationContext();
      appobj.scan("configration");
      appobj.refresh();
    }
}