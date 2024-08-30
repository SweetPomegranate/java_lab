package org.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.Arrays;

public class TestVariant1 {

    @Test
    public void integerNumbersTaskTest() {
        Assert.assertEquals(new Variant1().integerNumbersTask(250), 2);
        Assert.assertEquals(new Variant1().integerNumbersTask(99), 0);
        Assert.assertEquals(new Variant1().integerNumbersTask(100), 1);
    }

    @Test
    public void booleanTaskTest() {
        Assert.assertTrue(new Variant1().booleanTask(5));
        Assert.assertFalse(new Variant1().booleanTask(-3));
        Assert.assertFalse(new Variant1().booleanTask(0));
    }

    @Test
    public void ifTaskTest() {
        Assert.assertEquals(new Variant1().ifTask(5), 6);
        Assert.assertEquals(new Variant1().ifTask(-1), -1);
        Assert.assertEquals(new Variant1().ifTask(0), 0);
    }

    @Test(dataProvider = "switchProvider")
    public void switchTaskTest(int p1, String expected) {
        Assert.assertEquals(new Variant1().switchTask(p1), expected);
    }

    @DataProvider
    public Object[][] switchProvider() {
        return new Object[][] {
                { 1, "Monday" },
                { 4, "Thursday" },
                { 7, "Sunday" },
                { 8, "Not the right number" }
        };
    }

    @Test
    public void forTaskTest() {
        // Test the output visually or with a different approach if it prints values.
        System.out.println("Testing forTask with k = 7 and n = 4");
        new Variant1().forTask(7, 4);
    }

    @Test
    public void whileTaskTest() {
        Assert.assertEquals(new Variant1().whileTask(10, 3), 1);
        Assert.assertEquals(new Variant1().whileTask(12, 5), 2);
        Assert.assertEquals(new Variant1().whileTask(25, 7), 4);
    }

    @Test
    public void arrayTaskTest() {
        int[] expected = {1, 3, 5, 7, 9};
        int[] result = new Variant1().arrayTask(5);
        Assert.assertTrue(Arrays.equals(result, expected), "Array content does not match");
    }

    @Test
    public void twoDimensionArrayTaskTest() {
        int[][] expected = {
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };
        int[][] result = new Variant1().twoDimensionArrayTask(3, 5);
        for (int i = 0; i < expected.length; i++) {
            Assert.assertTrue(Arrays.equals(result[i], expected[i]), "Row " + i + " does not match");
        }
    }
}
