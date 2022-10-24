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
        String lineRead;
        Scanner sc = new Scanner(System.in);
        MsgElementReader mer = new MsgElementReader(sc);
        MsgLineReader mlr = new MsgLineReader(sc);
        int lineNo = 0;
        ArrayList lines = new ArrayList(10);
        
        try
        {
            while( (lineRead = mer.readFromKeyboard()) != null )
            {
                if(lineRead.equalsIgnoreCase("QUIT"))
                    break;                
                LineEntry le = new LineEntry(++lineNo, lineRead);
                lines.add(le);
            }
        }catch( NoSuchElementException e )
        {}
        
        lines.forEach(line ->
        {        
            System.out.println(line);
        });
    }
}
