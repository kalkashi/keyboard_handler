/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lbg.utils;

import com.celestial.App;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;
import org.jline.utils.NonBlockingReader;

/**
 *
 * @author selvy
 */
public class JLineHandler
{
    public static void fetchInput()
    {
        try
        {
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
