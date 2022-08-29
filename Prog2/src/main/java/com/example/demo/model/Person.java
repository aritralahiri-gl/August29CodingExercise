package com.example.demo.model;

public class Person {

	private int personId;
	private String personName;
	private String passion;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPassion() {
		return passion;
	}

	public void setPassion(String passion) {
		this.passion = passion;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", passion=" + passion + "]";
	}

}
