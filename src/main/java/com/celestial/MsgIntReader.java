package com.celestial;

import java.io.InputStream;
import java.util.Scanner;

public class MsgIntReader extends MsgReader
{
    public  MsgIntReader( ICustomPrompt prompt )
    {
        super( prompt );
    }
    
    @Override
    public  String readFromKeyboard( Scanner theScanner )
    {
        itsPrompt.prompt("Enter an Integer (White space as seperator):");

        String item = String.valueOf(theScanner.nextInt());

        return item;
    }
}
