/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celestial;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author selvy
 */
public class MsgElementReader   implements IElementReader
{
    @Override
    public  String readFromKeyboard( InputStream is )
    {
        Scanner theScanner = new Scanner( is );

        System.out.print("Enter an Item (White space as seperator): ");

        String item = theScanner.next();

        return item;
    }
}
