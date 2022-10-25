package com.celestial;

public class TextBlock 
{
	private	int		blockNo;
	private	String 	data;
	
	public	TextBlock(int blockNo, String data )
	{
		this.blockNo = blockNo;
		this.data = data;
	}
	
	public int getBlockNo() {
		return blockNo;
	}
	public String getData() {
		return data;
	}

	@Override
	public String toString() 
	{
		String padding = "";
		
		if( blockNo < 10 )
			padding = " ";
		
		return padding + getBlockNo() + ": " + getData();
	}
}
