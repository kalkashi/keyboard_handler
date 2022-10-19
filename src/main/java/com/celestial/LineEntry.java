/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celestial;

/**
 *
 * @author selvy
 */
public class LineEntry
{
    private final int     itsLineNo;
    private final String  itsText;

    public  LineEntry(int lineNo, String text )
    {
        this.itsLineNo = lineNo;
        this.itsText = text;
    }
    
    public int getItsLineNo()
    {
        return itsLineNo;
    }

    public String getItsText()
    {
        return itsText;
    } 
}
