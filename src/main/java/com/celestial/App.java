package com.celestial;

import java.util.ArrayList;
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
        int lineNo = 0;
        ArrayList lines = new ArrayList(10);
        
        try
        {
            while( prompt() && ((lineRead = sc.nextLine()) != null) )
            {
                LineEntry le = new LineEntry(++lineNo, lineRead);
                lines.add(le);
                if(lineRead.equalsIgnoreCase("QUIT"))
                    break;                
            }
        }catch( NoSuchElementException e )
        {}
        
        for(var line : lines )
            System.out.println(line.toString());        
    }
    
    static private boolean prompt()
    {
        System.out.print("Enter a message: ");
        return true;
    }
}
