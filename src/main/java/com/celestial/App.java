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
        MsgLineReader mlr = new MsgLineReader( System.in );
        		
        
        try
        {
            while((lineRead = mlr.readFromKeyboard()) != null )
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

}
