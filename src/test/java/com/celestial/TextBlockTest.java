package com.celestial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TextBlockTest 
{
	@Test
	void verify_format_for_blockNo_less_than_10() 
	{
		// arrange 
		int blockNo = 1;
		String data = "Hello";
		TextBlock cut = new TextBlock(blockNo, data);
		String expectedResult = " " + Integer.toString(blockNo) + ": " + data;
		
		// act
		String result = cut.toString();
		
		// assert
		assertEquals(expectedResult, result);
	}

	@Test
	void verify_format_for_blockNo_greater_than_9() 
	{
		// arrange 
		int blockNo = 10;
		String data = "Hello";
		TextBlock cut = new TextBlock(blockNo, data);
		String expectedResult = Integer.toString(blockNo) + ": " + data;
		
		// act
		String result = cut.toString();
		
		// assert
		assertEquals(expectedResult, result);
	}

	@Test
	void verify_format_for_blockNo_is_9_and_less_than_10() 
	{
		// arrange 
		int blockNo = 9;
		String data = "Hello";
		TextBlock cut = new TextBlock(blockNo, data);
		String expectedResult = " " + Integer.toString(blockNo) + ": " + data;
		
		// act
		String result = cut.toString();
		
		// assert
		assertEquals(expectedResult, result);
	}
}
