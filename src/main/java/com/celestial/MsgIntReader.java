package com.celestial;

import java.io.InputStream;
import java.util.Scanner;

public class MsgIntReader implements IElementReader
{
    @Override
    public  String readFromKeyboard( InputStream is )
    {
        Scanner theScanner = new Scanner( is );

        System.out.print("Enter an Integer (White space as seperator): ");

        String item = String.valueOf(theScanner.nextInt());

        return item;
    }
}
