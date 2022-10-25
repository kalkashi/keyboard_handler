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
		String lineRead;
		Scanner sc = new Scanner(System.in);
		ArrayList<TextBlock> lines = new ArrayList<>(10);
		int lineNo = 0;

		ArrayList<ElementReader> readers = new ArrayList<>(2);
		readers.add(new MsgLineReader(System.in));
		readers.add(new MsgElementReader(System.in));

		try 
		{
			while (true) 
			{
				for ( var reader : readers )
				{
					lineRead = reader.readFromKeyboard();
					
					if( lineRead != null )
					{
						if (lineRead.equalsIgnoreCase("QUIT"))
							break;
						TextBlock tb = new TextBlock(++lineNo, lineRead);
						lines.add(tb);
						System.out.println(lineRead);
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
