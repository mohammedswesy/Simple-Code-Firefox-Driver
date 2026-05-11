package com.testing;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumberCheckerTest {

    
    PrimeNumberChecker checker = new PrimeNumberChecker();

    @DataProvider(name = "CSVDataProvider")
    public Object[][] provideData() throws Exception {
        // 
        String filePath = "src/test/java/com/testing/resources/PrimeNumberTest.csv";
        List<Object[]> data = new ArrayList<>();
        String line;
        
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length < 3) continue; 
            
            data.add(new Object[] { 
                parts[0].trim(), 
                Integer.parseInt(parts[1].trim()), 
                Boolean.parseBoolean(parts[2].trim()) 
            });
        }
        br.close();
        return data.toArray(new Object[0][]);
    }

    @Test(dataProvider = "CSVDataProvider")
    public void testIsPrime(String description, int number, boolean expectedResult) {
        boolean actualResult = checker.isPrime(number);
        
        Assert.assertEquals(actualResult, expectedResult, "فشل الاختبار في حالة: " + description);
    }
}