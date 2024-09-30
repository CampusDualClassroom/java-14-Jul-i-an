package com.campusdual.classroom;

public class Teacher extends Person {

	protected String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}

	public void getDetails(){
		StringBuilder detalles = new StringBuilder();
		detalles.append("Name: ").append(this.name);
		detalles.append(", Surname: ").append(this.surname);
		detalles.append(", Area: ").append(this.area);

		System.out.println(detalles.toString());
	}
}
