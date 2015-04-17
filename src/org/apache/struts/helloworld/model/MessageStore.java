package org.apache.struts.helloworld.model;

/**
 * Model class that stores a message.
 * @author Bruce Phillips
 *
 */
public class MessageStore {
	
	private String message;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MessageStore() {
		
		setMessage("Hello Struts User");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
