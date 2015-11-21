package com.moodtunes.moodtunes;

public class Message extends IOMessage{
	
	public Message(String message){
		super(IOMessage.MESSAGE, -1, "", message);
	}
}
