package com.campusdual.classroom;

public class Person {
	protected String name;
	protected String surname;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public void getDetails(){
		StringBuilder detalles = new StringBuilder();
		detalles.append("Name: ").append(this.name);
		detalles.append(", Surname: ").append(this.surname);
		System.out.println(detalles);
	}
}
