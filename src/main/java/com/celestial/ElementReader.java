package com.celestial;

import java.io.InputStream;

public  abstract class  ElementReader 
{
    protected void prompt( String msg )
    {
    	System.out.print( msg );
    }
}

/*
 * Polymorphism is the ability to invoke the same operation
 * on different objects belonging to different types, resulting
 * in different methods being called
 */