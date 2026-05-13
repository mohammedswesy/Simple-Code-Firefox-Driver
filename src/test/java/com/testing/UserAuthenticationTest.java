package com.testing;

import org.testng.Assert;
import org.testng.Reporter; 
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserAuthenticationTest {

    UserAuthentication authSystem = new UserAuthentication();

    @Test(dataProvider = "loginData")
    public void testAuthentication(String username, String password, boolean expectedResult) {
        
        
        Reporter.log("بدء اختبار المصادقة للمستخدم: " + username, true);
        
        boolean actualResult = authSystem.authenticate(username, password);
        
        Reporter.log("النتيجة المتوقعة: " + expectedResult + " | النتيجة الحقيقية: " + actualResult, true);
        
         
        Assert.assertEquals(actualResult, expectedResult, "فشل الاختبار للمستخدم: " + username);
        
        Reporter.log("تم التحقق من الحالة بنجاح ", true);
        Reporter.log("-----------------------------------------", true);
    }

    @DataProvider(name = "loginData")
    public Object[][] provideLoginData() {
        return new Object[][] {
            {"admin", "password123", true},   
            {"admin", "wrong", false},          
            {"wrong", "password123", false},   
            {"", "", false},                   
            {null, null, false}                
        };
    }
}