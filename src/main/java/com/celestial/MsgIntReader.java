package com.celestial;

import java.io.InputStream;
import java.util.Scanner;

public class MsgIntReader implements IElementReader
{
    private ICustomPrompt itsPrompt;
    
    public  MsgIntReader( ICustomPrompt cp )
    {
        itsPrompt = cp;
    }
    
    public  void    setPrompt( ICustomPrompt cp )
    {
        itsPrompt = cp;
    }
        
    @Override
    public  String readFromKeyboard( InputStream is )
    {
        Scanner theScanner = new Scanner( is );

        itsPrompt.prompt("Enter an Integer (White space as seperator):");

        String item = String.valueOf(theScanner.nextInt());

        return item;
    }
}
