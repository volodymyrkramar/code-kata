package com.vkramar.codeKata.other;

public class ArrangingCoins {

    public int arrangeCoins(int n) {
        int next = 0;

        while (n - next > next) {
            n = n - next;
            next++;
        }

        return next;
    }
}
