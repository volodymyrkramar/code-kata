package com.vkramar.codeKata.other;

import com.vkramar.codeKata.arraysBasic.FindPivotIndex;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

public class TwoSumTest {

    public static final int[] inData1 = {2, 7, 11, 15};
    public static final int[] inData2 = {3, 2, 4};
    public static final int[] inData3 = {3, 3};
    public static final int inTarget1 = 9;
    public static final int inTarget2 = 6;
    public static final int inTarget3 = 6;
    public static final int[] EXPECTED_RESULT_1 = {0, 1};
    public static final int[] EXPECTED_RESULT_2 = {1, 2};
    public static final int[] EXPECTED_RESULT_3 = {0, 1};

    TwoSum twoSum = new TwoSum();

    @Test
    public void shouldReturnExpectedSums() {
        Calendar start = Calendar.getInstance();

        Assert.assertArrayEquals(EXPECTED_RESULT_1, twoSum.twoSum(inData1, inTarget1));
        Assert.assertArrayEquals(EXPECTED_RESULT_2, twoSum.twoSum(inData2, inTarget2));
        Assert.assertArrayEquals(EXPECTED_RESULT_3, twoSum.twoSum(inData3, inTarget3));

        Calendar end = Calendar.getInstance();
        System.out.println(end.getTimeInMillis() - start.getTimeInMillis());
    }

}