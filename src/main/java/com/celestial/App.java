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
        MsgElementReader obj = new MsgElementReader();
        ArrayList lines = obj.readFromKeyboard();
        lines.forEach(line ->
        {        
            System.out.println(line);
        });
    }

}
