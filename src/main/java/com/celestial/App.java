package com.celestial;

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
        
        prompt();
        lineRead = sc.next();

        while( lineRead != null )
        {
            System.out.println(lineRead);
            prompt();
            lineRead = sc.next();            
        }
    }
    
    static private boolean prompt()
    {
        System.out.print("Press a key:");
        return true;
    }

}
