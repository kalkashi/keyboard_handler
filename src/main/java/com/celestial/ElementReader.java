/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celestial;

import java.io.InputStream;

/**
 *
 * @author selvy
 */
public abstract class ElementReader
{
    protected void prompt( String msg )
    {
        System.out.println( msg );
    }

    abstract    public  String readFromKeyboard(InputStream is);
}
