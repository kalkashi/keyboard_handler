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
        String lineRead = "";
        boolean exitApp = false;
        MsgElementReader mer = new MsgElementReader();
        MsgLineReader mlr = new MsgLineReader();
        MsgIntReader mir = new MsgIntReader();
        ArrayList<IElementReader> readers = new ArrayList<>(2);
        readers.add(mer);
        readers.add(mlr);
        readers.add(mir);
        int lineNo = 0;
        ArrayList lines = new ArrayList(10);
        
        try
        {
            while( !exitApp && lineRead != null )
            {
                for(var reader : readers) {
                    lineRead = reader.readFromKeyboard(System.in);
                    if (lineRead.equalsIgnoreCase("QUIT"))
                    {
                        exitApp = true;
                        break;
                    }
                    LineEntry le = new LineEntry(++lineNo, lineRead);
                    lines.add(le);                    
                }
            }
        }catch( NoSuchElementException e )
        {}
        
        lines.forEach(line ->
        {        
            System.out.println(line);
        });
    }
}
