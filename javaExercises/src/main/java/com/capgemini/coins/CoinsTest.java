package com.capgemini.coins;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CoinsTest {

	@Test
	public void coinTest() {
		List<Integer> coins = new ArrayList<Integer>();
		coins.add(1);
		coins.add(0);
		coins.add(0);
		coins.add(0);
		coins.add(0);
		coins.add(0);
		int result;
		result = Coins.solution(coins);
		assertEquals(5, result);
	}

}
