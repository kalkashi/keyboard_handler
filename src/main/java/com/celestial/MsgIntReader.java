package com.celestial;

import java.io.InputStream;
import java.util.Scanner;

public class MsgIntReader extends ElementReader
{
    public  void prompt()
    {
        System.out.print("Enter an Integer (White space as seperator): ");
    }

    @Override
    public  String readFromKeyboard( InputStream is )
    {
        Scanner theScanner = new Scanner( is );

        prompt();

        String item = String.valueOf(theScanner.nextInt());

        return item;
    }
}
