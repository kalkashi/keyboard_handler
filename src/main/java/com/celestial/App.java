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
        ArrayList<TextBlock> lines = new ArrayList<>(10);
        int lineNo = 0;
        
        try
        {
            while( prompt() && (lineRead = sc.next()) != null )
            {
                if( lineRead.equalsIgnoreCase("QUIT"))
                	break;
                TextBlock tb = new TextBlock(++lineNo, lineRead);
            	lines.add(tb);
                System.out.println(lineRead);
            }
        }catch( NoSuchElementException e )
        {}
        
        for( var tb : lines)
        	System.out.println(tb);
        
        lines.forEach(tb ->{
        	System.out.println(tb);
        });
    }
    
    static private boolean prompt()
    {
        System.out.print("Enter a message:");
        return true;
    }
    
    public void	fooBar()
    {
    	int x;
    	x = 3;
    	int y = 4;
    	
    	TextBlock tb2 = new TextBlock(2, "Ariana");
    }
}
