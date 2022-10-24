package com.celestial;

import java.io.InputStream;
import java.util.Scanner;

public class MsgIntReader extends ElementReader
{
    @Override
    public  String readFromKeyboard( InputStream is )
    {
        Scanner theScanner = new Scanner( is );

        prompt("Enter an Integer (White space as seperator): ");

        String item = String.valueOf(theScanner.nextInt());

        return item;
    }
}
