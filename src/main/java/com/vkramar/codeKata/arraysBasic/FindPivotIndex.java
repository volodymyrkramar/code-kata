package com.vkramar.codeKata.arraysBasic;

import java.util.Arrays;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int fullSum = Arrays.stream(nums).sum();
        int sL = 0;
        int sR;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                sL += nums[i - 1];
            }
            sR = fullSum - sL - nums[i];
            if (sL == sR) {
                return i;
            }

        }
        return -1;
    }
}
