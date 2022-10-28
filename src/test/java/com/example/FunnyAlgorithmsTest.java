package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FunnyAlgorithmsTest {

    private FunnyAlgorithms funnyAlgorithm;
    public ExpectedException expectedEx = ExpectedException.none();

    private static int firstArray[];
    private static int secondArray[];
    private static int thirdArray[];

    @BeforeClass
    public static void initArray() {
        firstArray = new int[]{1,6,7,8,10};
        secondArray = new int[]{-4,8,9,22};
        thirdArray = null;
    }

    @Before
    public void prepareTest() {
        funnyAlgorithm = new FunnyAlgorithms();
    }

    @Test
    public void testBinarySearch() {
        assertEquals(1, funnyAlgorithm.binarySearch(firstArray, 6));
        assertEquals(-1, funnyAlgorithm.binarySearch(secondArray, 25));
    }

    @Test(expected = NullPointerException.class)
	public void testBinarySearchThrowsException() {
		funnyAlgorithm.binarySearch(thirdArray, 0);
	}

    @Test
    public void testSelectionSort() {

    }

    @Test
    public void testStringToIntConverter() {

    }

    @Test
    public void testSwap() {

    }
}
