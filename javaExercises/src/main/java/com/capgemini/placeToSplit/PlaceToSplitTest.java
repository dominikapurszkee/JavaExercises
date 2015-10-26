package com.capgemini.placeToSplit;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlaceToSplitTest {

	@Test
	public void testPlaceToSplit() {
		int [] tab= {9,1};
		boolean result;
		result=PlaceToSplit.canBalance(tab);
		assertEquals(false, result);
		
	}

}
