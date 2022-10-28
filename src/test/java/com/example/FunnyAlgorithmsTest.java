package com.example;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FunnyAlgorithmsTest {

    private FunnyAlgorithms funnyAlgorithm;
    public ExpectedException expectedEx = ExpectedException.none();

    private static int firstArraySorted[];
    private static int secondArraySorted[];
    private static int thirdArraySorted[];
    private static int firstArrayShuffled[];
    private static int secondArrayShuffled[];
    private static int thirdArrayShuffled[];


    @BeforeClass
    public static void initArrays() {
        firstArraySorted = new int[]{1,6,6,7,8,8,10};
        secondArraySorted= new int[]{-20,-4,8,9,22,58,64};
        thirdArraySorted = null;

        firstArrayShuffled= new int[]{1,10,7,6,8};
        secondArrayShuffled = new int[]{64,-4,8,20,22,58,9};
        thirdArrayShuffled= null;
    }

    @Before
    public void prepareTest() {
        funnyAlgorithm = new FunnyAlgorithms();
    }

    @Test
    public void testBinarySearch() {
        assertEquals(1, funnyAlgorithm.binarySearch(firstArraySorted, 6));
        assertEquals(-1, funnyAlgorithm.binarySearch(secondArraySorted, 25));
    }

    @Test(expected = NullPointerException.class)
	public void testBinarySearchThrowsException() {
		funnyAlgorithm.binarySearch(thirdArraySorted, 0);
	}

    @Test
    public void testAscendingSelectionSort() {
    }

    @Test
    public void testDescendingSelectionSort() {

    }

    @Test
    public void testStringToIntConverter() {

    }

    @Test
    public void testSwap() {

    }
}
