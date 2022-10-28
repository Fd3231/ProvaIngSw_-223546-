package com.example;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.joda.time.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FunnyAlgorithmsTest {

    private FunnyAlgorithms funnyAlgorithm;
    private static final String pattern = "dd/mm/yyyy HH:mm:ss.SSSS";

    private static int firstArraySorted[];
    private static int secondArraySorted[];
    private static int thirdArraySorted[];
    private static int firstArrayShuffled[];
    private static int secondArrayShuffled[];
    private static int firstArraySortedDescending[];
    private static int secondArraySortedDescending[];


    @BeforeClass
    public static void initArrays() {
        firstArraySorted = new int[]{1,6,6,7,8,8,10};
        secondArraySorted= new int[]{-20,-4,8,9,22,58,64};
        thirdArraySorted = null;
        firstArraySortedDescending = new int[]{10,8,8,7,6,6,1};
        secondArraySortedDescending= new int[]{64,58,22,9,8,-4,-20};
    }

    @Before
    public void prepareTest() {
        DateTime dt = new DateTime();
        System.out.println(dt.toString(pattern));
        funnyAlgorithm = new FunnyAlgorithms();
        firstArrayShuffled= new int[]{1,10,7,6,8,6,8};
        secondArrayShuffled = new int[]{64,-4,8,20,22,58,9};
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
        funnyAlgorithm.selectionSort(firstArrayShuffled, 0);
        assertArrayEquals(firstArraySorted, firstArrayShuffled);
        funnyAlgorithm.selectionSort(secondArraySorted, 0);
        assertArrayEquals(secondArraySorted, secondArrayShuffled);
    }

    @Test
    public void testDescendingSelectionSort() {
        funnyAlgorithm.selectionSort(firstArrayShuffled, 1);
        assertArrayEquals(firstArraySortedDescending, firstArrayShuffled);
        funnyAlgorithm.selectionSort(secondArraySorted, 1);
        assertArrayEquals(secondArraySortedDescending, secondArrayShuffled);
    }

    @Test
    public void testStringToIntConverter() {
        assertEquals(-3, funnyAlgorithm.stringToIntConverter("-3"));
        assertEquals(500, funnyAlgorithm.stringToIntConverter("500"));
        assertEquals(-10, funnyAlgorithm.stringToIntConverter("-10"));
        assertEquals(32767, funnyAlgorithm.stringToIntConverter("32767"));
    }

    @Test(expected = IllegalArgumentException.class) 
    public void stringToIntConverterShouldThrowException(){
        funnyAlgorithm.stringToIntConverter("2 3");
        funnyAlgorithm.stringToIntConverter("32768");
        funnyAlgorithm.stringToIntConverter("A3");
        funnyAlgorithm.stringToIntConverter("2.3");
        
    }

    @AfterClass
    public static void endTest() {
        DateTime dt = new DateTime();
        System.out.println(dt.toString(pattern));
    }

}
