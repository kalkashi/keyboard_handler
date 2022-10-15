/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lbg.utils;

import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author selvy
 */
public class keyboardHandler
{
    private final InputStream itsInputStream;
    
    public  keyboardHandler( InputStream iStream )
    {
        itsInputStream = iStream;
    }
    
    public  void    readChars()
    {
        String x;
        Scanner sc = new Scanner(itsInputStream);
        
        try
        {
            prompt();
            x = sc.next();

            while( x != null )
            {
                System.out.println(x);
                prompt();
                x = sc.next();            
            }
        }catch( NoSuchElementException e )
        {}
    }
    
    private boolean prompt()
    {
        System.out.print("Press a key:");
        return true;
    }
    
}
