package com.vkramar.codeKata.arraysBasic;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

public class LargestNumberAtLeastTwiceOfOthersTest {

    public static final int[] inData1 = {3, 6, 1, 0};
    public static final int[] inData2 = {1, 2, 3, 4};
    public static final int[] inData3 = {1};
    public static final int EXPECTED_RESULT_1 = 1;
    public static final int EXPECTED_RESULT_2 = -1;
    public static final int EXPECTED_RESULT_3 = 0;

    LargestNumberAtLeastTwiceOfOthers largestNumberAtLeastTwiceOfOthers = new LargestNumberAtLeastTwiceOfOthers();

    @Test
    public void shouldReturnLargestNumberAtLeastTwiceOfOthers() {
        Calendar start = Calendar.getInstance();

        Assert.assertEquals(EXPECTED_RESULT_1, largestNumberAtLeastTwiceOfOthers.dominantIndex(inData1));
        Assert.assertEquals(EXPECTED_RESULT_2, largestNumberAtLeastTwiceOfOthers.dominantIndex(inData2));
        Assert.assertEquals(EXPECTED_RESULT_3, largestNumberAtLeastTwiceOfOthers.dominantIndex(inData3));

        Calendar end = Calendar.getInstance();
        System.out.println(end.getTimeInMillis() - start.getTimeInMillis());

    }
}