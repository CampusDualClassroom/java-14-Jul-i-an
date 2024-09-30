package com.campusdual.classroom;

public class PoliceOfficer extends Person {

	protected String squad;

	public PoliceOfficer(String name, String surname, String squad) {
		super(name, surname);
		this.squad = squad;
	}

	public void getDetails(){
		StringBuilder detalles = new StringBuilder();
		detalles.append("Name: ").append(this.name);
		detalles.append(", Surname: ").append(this.surname);
		detalles.append(", Squad: ").append(this.squad);
		System.out.println(detalles.toString());
	}
}
