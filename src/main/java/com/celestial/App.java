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
    public static void main( String[] args )
    {
        String lineRead;
        Scanner sc = new Scanner(System.in);
        ArrayList lines = new ArrayList(10);
        int lineNo = 0;
        
        try
        {
            while( prompt() && (lineRead = sc.next()) != null )
            {
                if( lineRead.equalsIgnoreCase("QUIT"))
                	break;
            	lines.add(lineRead);
                System.out.println(lineRead);
            }
        }catch( NoSuchElementException e )
        {}
        
        for( var line : lines)
        	System.out.println(++lineNo + ": " + line);
    }
    
    static private boolean prompt()
    {
        System.out.print("Enter a message:");
        return true;
    }
}
