package com.campusdual.classroom;

public class Doctor extends Person {

	protected String specialization;

	public Doctor(String name, String surname, String specialization) {
		super(name, surname);
		this.specialization = specialization;
	}

	public void getDetails(){
		StringBuilder detalles = new StringBuilder();
		detalles.append("Name: ").append(this.name);
		detalles.append(", Surname: ").append(this.surname);
		detalles.append(", Specialization: ").append(this.specialization);
		System.out.println(detalles.toString());
	}

}
