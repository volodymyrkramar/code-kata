package com.vkramar.codeKata.arraysBasic;

public class LargestNumberAtLeastTwiceOfOthers {

    public int dominantIndex(int[] nums) {
        int max = 0;
        int secondMax = 0;
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                maxIndex = i;

                if (secondMax >= 50) {

                    return -1;
                }

            } else {

                if (nums[i] > secondMax) {
                    secondMax = nums[i];
                }

            }
        }

        if (max >= secondMax * 2 && max > 0) {

            return maxIndex;
        } else {

            return -1;
        }
    }
}
