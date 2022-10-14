/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lbg.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        int x;
        Scanner sc = new Scanner(itsInputStream);
        
        prompt();
        x = sc.nextInt();
        
        while( x != -1 )
        {
            System.out.println(x);
            prompt();
            x = sc.nextInt();            
        }
    }
    
    private boolean prompt()
    {
        System.out.print("Press a key:");
        return true;
    }
    
}
