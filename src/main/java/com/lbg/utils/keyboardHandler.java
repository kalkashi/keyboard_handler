/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lbg.utils;

import java.io.IOException;
import java.io.InputStream;
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
        
        try
        {
            while( prompt() && (x = itsInputStream.read()) != -1 )            
            {
                System.out.println(x);
            }
        } catch (IOException ex)
        {
            Logger.getLogger(keyboardHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private boolean prompt()
    {
        System.out.print("Press a key:");
        return true;
    }
    
}
