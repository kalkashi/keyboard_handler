package com.celestial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class MsgLineReaderTest 
{
	@Test
	void test_Read_From_Keyboard() 
	{
		// arrange
		Scanner mockScanner = mock(Scanner.class); 
		when(mockScanner.nextLine()).thenReturn("Hello from Selvyn");
        CustomPrompt cp = new CustomPrompt();
        MsgLineReader mlr = new MsgLineReader(cp);
        String expectedResult = "Hello from Selvyn";
		
		// act
        String result = mlr.readFromKeyboard(mockScanner);
		
		// assert
        assertEquals(expectedResult, result);
	}

}
