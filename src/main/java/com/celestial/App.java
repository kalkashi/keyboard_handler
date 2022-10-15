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

        System.out.println(lineRead);

    }
    
    static private void prompt()
    {
        System.out.print("Press a key:");
    }

}
