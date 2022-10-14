package com.celestial;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;
import org.jline.utils.NonBlockingReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try
        {
            //        keyboardHandler kh = new keyboardHandler(System.in);
//
//        kh.readChars();

            
            Terminal terminal = TerminalBuilder.builder().jna(true)
                                                         .system(true)
                                                         .build();
            
            // raw mode means we get keypresses rather than line buffered input
            terminal.enterRawMode();
            NonBlockingReader reader = terminal.reader();
            int read = reader.read();
            reader.close();
            terminal.close();
            System.out.println( read);
        } catch (IOException ex)
        {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
