package com.celestial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Keyboard Handler
 *
 */
public class App 
{
	public static void main(String[] args) 
	{
		String lineRead = "";
		boolean	exitApp = false;
		ArrayList<TextBlock> lines = new ArrayList<>(10);
		int lineNo = 0;

		ArrayList<ElementReader> readers = new ArrayList<>(2);
		readers.add(new MsgLineReader());
		readers.add(new MsgElementReader());
		
		try 
		{
			while (!exitApp && lineRead != null) 
			{
				for ( var reader : readers )
				{
					lineRead = reader.readFromKeyboard(System.in);
					
					if( lineRead != null )
					{
						if (lineRead.equalsIgnoreCase("QUIT"))
						{
							exitApp = true;
							break;
						}
						TextBlock tb = new TextBlock(++lineNo, lineRead);
						lines.add(tb);
					}else
						break;
				}
			}
		} catch (NoSuchElementException e) {
		}

		for (var tb : lines)
			System.out.println(tb);

		lines.forEach(tb -> {
			System.out.println(tb);
		});
	}

}
