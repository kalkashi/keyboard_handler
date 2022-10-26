package com.celestial;

import java.io.InputStream;
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
//		ArrayList<TextBlock> lines;
//
//		CustomPrompt cp = new CustomPrompt();
//		FunkyPrompt fk = new FunkyPrompt();
//		ArrayList<IElementReader> readers = new ArrayList<>(2);
//		readers.add(new MsgLineReader(fk));
//		readers.add(new MsgElementReader(cp));
//		
//		Runner rnr = new Runner( readers );
//		
//		lines = rnr.run();
//
//		for (var tb : lines)
//			System.out.println(tb);
//
//		lines.forEach(tb -> {
//			System.out.println(tb);
//		});
		
		IElementReader er = (is) ->{
			System.out.println( "Hello from lambda");
			return null;
			};
			
		fooBar(er);
	}
	
	public static void fooBar(IElementReader rr )
	{
		rr.readFromKeyboard(System.in);
	}
}
