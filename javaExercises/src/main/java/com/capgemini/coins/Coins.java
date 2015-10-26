package com.capgemini.coins;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ldrygala on 2015-02-06.
 * <p/>
 * Consider N coins aligned in a row. Each coin is showing either heads or
 * tails. The adjacency of these coins is the number of adjacent pairs of coins
 * with the same side facing up.
 * <p/>
 * It must return the maximum possible adjacency that can be obtained by
 * reversing exactly one coin (that is, one of the coins must be reversed).
 * Consecutive elements of array A represent consecutive coins in the row. Array
 * A contains only 0s and/or 1s: 0 represents a coin with heads facing up; 1
 * represents a coin with tails facing up. For example, given array A consisting
 * of six numbers, such that:
 * <p/>
 * A[0] = 1 A[1] = 1 A[2] = 0 A[3] = 1 A[4] = 0 A[5] = 0
 * <p/>
 * the function should return 4. The initial adjacency is 2, as there are two
 * pairs of adjacent coins with the same side facing up, namely (0, 1) and (4,
 * 5). After reversing the coin represented by A[2], the adjacency equals 4, as
 * there are four pairs of adjacent coins with the same side facing up, namely:
 * (0, 1), (1, 2), (2, 3) and (4, 5), and it is not possible to obtain a higher
 * adjacency. The same adjacency can be obtained by reversing the coin
 * represented by A[3].
 */
public class Coins {
	public static int solution(List<Integer> coins) {

		int n = coins.size();

		int i = 1;
		boolean change = false;
		while ((i < n) && (change != true)) {

			if ((coins.get(i - 1) != coins.get(i)) && (coins.get(i + 1) != coins.get(i))) {

				int temp = coins.get(i - 1);
				coins.set(i, temp);
				change = true;
			} else
				i++;
		}

		if ((coins.get(0) != coins.get(1)) && (change != true)) {
			int temp = coins.get(1);
			coins.set(0, temp);
			change = true;
		}

		if ((coins.get(n - 1) != coins.get(n - 2)) && (change != true)) {
			int temp = coins.get(n - 2);
			coins.set(n - 1, temp);
			change = true;
		}

		if ((change != true)) {
			int temp = coins.get(1);
			coins.set(0, temp);
			change = true;
		}

		int counter = 0;

		for (int j = 0; j < n - 1; j++) {
			if (coins.get(j) == coins.get(j + 1)) {
				counter++;
			}
		}

		return counter;
	}

	public static void main(String... args) {

		List<Integer> coins = new ArrayList<Integer>();
		coins.add(0);
		coins.add(1);
		coins.add(0);
		coins.add(0);
		coins.add(1);

		System.out.println(solution(coins));
	}

}
