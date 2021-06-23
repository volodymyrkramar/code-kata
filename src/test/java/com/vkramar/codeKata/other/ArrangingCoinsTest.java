package com.vkramar.codeKata.other;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

public class ArrangingCoinsTest {
    public static final int inData1 = 5;
    public static final int inData2 = 8;
    public static final int EXPECTED_RESULT_1 = 2;
    public static final int EXPECTED_RESULT_2 = 3;

    ArrangingCoins arrangingCoins = new ArrangingCoins();

    @Test
    public void shouldReturnExpectedPivotIndex() {
        Calendar start = Calendar.getInstance();

        Assert.assertEquals(EXPECTED_RESULT_1, arrangingCoins.arrangeCoins(inData1));
        Assert.assertEquals(EXPECTED_RESULT_2, arrangingCoins.arrangeCoins(inData2));

        Calendar end = Calendar.getInstance();
        System.out.println(end.getTimeInMillis() - start.getTimeInMillis());
    }
}