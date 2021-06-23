package com.vkramar.codeKata.arraysBasic;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

public class FindPivotIndexTest {

    public static final int[] inData1 = {1, 7, 3, 6, 5, 6};
    public static final int[] inData2 = {1, 2, 3};
    public static final int[] inData3 = {2, 1, -1};
    public static final int EXPECTED_RESULT_1 = 3;
    public static final int EXPECTED_RESULT_2 = -1;
    public static final int EXPECTED_RESULT_3 = 0;

    FindPivotIndex findPivotIndex = new FindPivotIndex();

    @Test
    public void shouldReturnExpectedPivotIndex() {
        Calendar start = Calendar.getInstance();

        Assert.assertEquals(EXPECTED_RESULT_1, findPivotIndex.pivotIndex(inData1));
        Assert.assertEquals(EXPECTED_RESULT_2, findPivotIndex.pivotIndex(inData2));
        Assert.assertEquals(EXPECTED_RESULT_3, findPivotIndex.pivotIndex(inData3));

        Calendar end = Calendar.getInstance();
        System.out.println(end.getTimeInMillis() - start.getTimeInMillis());
    }
}