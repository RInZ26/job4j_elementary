package ru.job4j.sort;

import java.util.Arrays;
import java.util.Collections;

public class Machine {
    @SuppressWarnings("checkstyle:MemberName")
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
	int size = 100, counter = 0;
	int[] rsl = new int[size];
	if (money > price) {
	    money -= price;
	    for (int c = 0; c < COINS.length; c++) {
		while (money >= COINS[c]) {
		    rsl[counter++] = COINS[c];
		    money -= COINS[c];
		}
	    }
	}
	return Arrays.copyOf(rsl, counter);
    }
}