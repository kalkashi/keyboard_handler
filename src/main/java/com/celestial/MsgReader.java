package com.celestial;

import java.io.InputStream;

public abstract class MsgReader implements IElementReader 
{
	protected	IPrompt itsPrompt;
	
	public	MsgReader( IPrompt cp )
	{
		itsPrompt = cp;
	}
	
	public	void setPrompt( IPrompt cp )
	{
		itsPrompt = cp;
	}
	
    //abstract String readFromKeyboard( InputStream is); 
}
