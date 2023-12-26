package com.techproed;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FirstJUnitClass {
    @Test
    public void test1(){

        System.out.println("This is  my first test case");

    }
    @Ignore
    @Test
    public void test2(){
        System.out.println("This my second test case");
    }
    @Test
    public void test3(){
        System.out.println("this my third test case");
    }

    //Create a method name:setup
    //print ths is before method
    @Before

    public void setUp(){
        System.out.println("This is before method");
    }

    @After
    public void tearDown(){
        System.out.println("This is my after method");
    }







}
