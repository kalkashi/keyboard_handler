/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celestial;

import java.util.Scanner;

/**
 *
 * @author selvy
 */
public class MsgLineReader
{
    private final Scanner theScanner;
    
    public  MsgLineReader( Scanner sc )
    {
        theScanner = sc;
    }
    
    public  void prompt()
    {
        System.out.print("Enter a message (enter to complete): ");
    }
    
    public  String readFromKeyboard()
    {
        prompt();
        
        return theScanner.nextLine();
    }
    
}
