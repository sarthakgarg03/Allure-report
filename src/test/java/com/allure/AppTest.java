package com.allure;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Flaky
    @Link(name="Example", url="https://example.org")
    @Step("Step1 for method {me}")
    @Test(priority = 0, description="Testcase1 description")
    @Severity(SeverityLevel.BLOCKER)
    public void Test1(){
       Assert.assertTrue(false,"failed");

    }

    @Test(dependsOnMethods = {"Test1"})
    public void Test2(){
        Assert.assertTrue(false,"failed");

    }

    @Test
    public void Test3(){

    }

}
