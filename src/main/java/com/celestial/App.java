package com.celestial;

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
        String lines[] = new String[3];
        int growSize = lines.length;
        
        try
        {
            for( int idx = 0; idx < lines.length && prompt() && ((lineRead = sc.nextLine()) != null); idx++ )
            {
                lines[idx] = lineRead;
                if(lineRead.equalsIgnoreCase("QUIT"))
                    break;
                if( idx % growSize == 0 )
                   lines = Arrays.copyOf(lines, lines.length+growSize);
                
            }
        }catch( NoSuchElementException e )
        {}
        
        for( String line : lines )
            System.out.println(line);
    }
    
    static private boolean prompt()
    {
        System.out.print("Enter a message: ");
        return true;
    }
}
