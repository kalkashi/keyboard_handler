package com.celestial;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MsgElementReader {

    public ArrayList readFromKeyboard() {
        String lineRead;
        Scanner sc = new Scanner(System.in);
        int lineNo = 0;
        ArrayList lines = new ArrayList(10); // make it type safe

        try
        {
            while( prompt() && ((lineRead = sc.nextLine()) != null) )
            {
                if(lineRead.equalsIgnoreCase("QUIT"))
                    break;
                LineEntry le = new LineEntry(++lineNo, lineRead);
                lines.add(le);

            }
        }catch( NoSuchElementException e )
        {}
        return lines;

    }

    static private boolean prompt()
    {
        System.out.print("Enter a message: ");
        return true;
    }
}
