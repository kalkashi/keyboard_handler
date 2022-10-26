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
        ICustomPrompt thePrompt = new CustomPrompt();
        ICustomPrompt theFKPrompt = new FunkyPrompt();
        MsgElementReader mer = new MsgElementReader(theFKPrompt);
        MsgLineReader mlr = new MsgLineReader(thePrompt);
        MsgIntReader mir = new MsgIntReader( thePrompt );
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
