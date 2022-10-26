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
 * @author selvyn
 * 
 * I really don't like the use of inheritance just to get hold the prompt()
 * method, and there's no real polymorphism here.  So I'm going to use
 * CustomPrompt in an aggregate relationship instead
 */
public class MsgElementReader extends MsgReader
{    
    public  MsgElementReader( ICustomPrompt prompt )
    {
        super( prompt );
    }
    
    @Override
    public  String readFromKeyboard( InputStream is )
    {
        Scanner theScanner = new Scanner( is );

        itsPrompt.prompt("Enter an Item (White space as seperator):");

        String item = theScanner.next();

        return item;
    }
}
