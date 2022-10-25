package com.celestial;

import java.io.InputStream;
import java.util.Scanner;

public class MsgLineReader 
{
	private Scanner theScanner;
	
public	MsgLineReader( InputStream is )
	{
		theScanner = new Scanner(is);
	}
	
    private void prompt()
    {
        System.out.print("Enter a line of Text (hit enter):");
    }
    
    public	String readFromKeyboard()
    {
    	prompt();
    	return theScanner.nextLine();
    }
}
