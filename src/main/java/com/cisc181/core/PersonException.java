package com.cisc181.core;

public class PersonException extends Exception{
	private String Person;
	
	public PersonException(String Person){
		super();
		this.Person =Person;
		
	}
	
}
