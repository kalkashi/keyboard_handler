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
public abstract class MsgReader implements IElementReader
{
    protected ICustomPrompt itsPrompt;
    
    public  MsgReader( ICustomPrompt cp )
    {
        itsPrompt = cp;
    }
    
    public  void    setPrompt( ICustomPrompt cp )
    {
        itsPrompt = cp;
    }

}
