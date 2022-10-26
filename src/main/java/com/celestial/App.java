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
        CustomPrompt thePrompt = new CustomPrompt();
        MsgElementReader mer = new MsgElementReader(thePrompt);
        MsgLineReader mlr = new MsgLineReader(thePrompt);
        MsgIntReader mir = new MsgIntReader();
        ArrayList<IElementReader> readers = new ArrayList<>(2);
        readers.add(mer);
        readers.add(mlr);
        readers.add(mir);
        
        Runner rnr = new Runner( readers );
        
        ArrayList<LineEntry> lines = rnr.run();
        
        lines.forEach(line ->
        {        
            System.out.println(line);
        });
    }
}
