package com.testing;

import org.testng.Assert;
import org.testng.annotations.*;

import project1.Fruit;

import java.util.ArrayList;
import java.util.List;

public class FruitCartTest {

    List<Fruit> cart;

    @BeforeSuite
    public void setupSuite() {
        System.out.println("Welcome to the fruit shop");
    }

    @BeforeMethod
    public void setupCart() {
        cart = new ArrayList<>();

        cart.add(new Fruit("Oranges", 12));
        cart.add(new Fruit("Banana", 24));
        cart.add(new Fruit("Apple", 11));
        cart.add(new Fruit("Strawberry", 5));
    }

    @Test(priority = 1)
    public void testCartSize() {
        Assert.assertEquals(cart.size(), 4, "Cart should contain 4 items");
    }

    @Test(priority = 2)
    public void testNoPineapple() {
        boolean hasPineapple = cart.stream()
                .anyMatch(fruit -> fruit.getName().equals("Pineapple"));

        Assert.assertFalse(hasPineapple, "Cart should not contain Pineapple");
    }

    @Test(priority = 3)
    public void testSecondItem() {
        Assert.assertEquals(cart.get(1).getName(), "Banana", "The second item should be Banana");
    }

    @Test(priority = 4)
    public void testAddingMango() {
        cart.add(new Fruit("Mango", 54));

        Assert.assertEquals(cart.size(), 5, "Number of items should be 5 after adding Mango");
    }

    @AfterSuite
    public void tearDownSuite() {
        System.out.println("Goodbye and see you later");
    }
}