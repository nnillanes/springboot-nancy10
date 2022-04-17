package com.example.restservice;

public class Customer {
	private String name;
	private String surname;
	private String email;

	public Customer(String name, String surname, String email)
	{
		this.name = name;
		this.surname = surname;
		this.email = email;
	}

	public String getName()
	{
		return name;
	}
	public String getSurname()
	{
		return surname;
	}
	public String getEmail()
	{
		return email;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setSurname(String surname)
	{
		this.surname = surname;
	}
}