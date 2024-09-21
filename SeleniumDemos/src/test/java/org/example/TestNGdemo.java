package org.example;

import org.testng.annotations.*;

public class TestNGdemo {
    @BeforeClass(description = "this will execute before all the test methods")
    public void beforeMethod() {
        System.out.println("Opening chrome");
    }
    @AfterClass(description = "this will execute before all the test methods")
    public void afterMethod() {
        System.out.println("closing chrome");
    }
    @Test
    public void test1() {
        System.out.println("This is test1");
    }

    @Test
    public void test2() {
        System.out.println("This is test2");
    }

    @Test
    public void test3() {
        System.out.println("This is test3");
    }


}
