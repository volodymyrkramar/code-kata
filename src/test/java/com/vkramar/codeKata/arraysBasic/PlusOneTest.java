package com.vkramar.codeKata.arraysBasic;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

public class PlusOneTest {

    public static final int[] inData1 = {1, 2, 3};
    public static final int[] inData2 = {4, 3, 2, 1};
    public static final int[] inData3 = {0};
    public static final int[] EXPECTED_RESULT_1 = {1, 2, 4};
    public static final int[] EXPECTED_RESULT_2 = {4, 3, 2, 2};
    public static final int[] EXPECTED_RESULT_3 = {1};

    PlusOne plusOne = new PlusOne();

    @Test
    public void shouldReturnExpectedArray() {
        Calendar start = Calendar.getInstance();

        Assert.assertArrayEquals(EXPECTED_RESULT_1, plusOne.plusOne(inData1));
        Assert.assertArrayEquals(EXPECTED_RESULT_2, plusOne.plusOne(inData2));
        Assert.assertArrayEquals(EXPECTED_RESULT_3, plusOne.plusOne(inData3));

        Calendar end = Calendar.getInstance();
        System.out.println(end.getTimeInMillis() - start.getTimeInMillis());
    }
}