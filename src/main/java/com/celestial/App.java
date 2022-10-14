package com.celestial;

import com.lbg.utils.keyboardHandler;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        keyboardHandler kh = new keyboardHandler(System.in);
        
        kh.readChars();
    }
}
