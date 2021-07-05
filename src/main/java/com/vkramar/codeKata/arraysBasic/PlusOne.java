package com.vkramar.codeKata.arraysBasic;

public class PlusOne {
    public int[] plusOne(int[] digits) {

        boolean isPlusOne = false;

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i] += 1;

                return digits;
            } else {
                digits[i] = 0;
                if ((i == 0 && isPlusOne) || digits.length == 1) {
                    int[] second = new int[digits.length + 1];
                    System.arraycopy(digits, 0, second, 1, digits.length);
                    second[0] = 1;

                    return second;
                } else {
                    isPlusOne = true;
                }
            }
        }

        return digits;
    }
}
