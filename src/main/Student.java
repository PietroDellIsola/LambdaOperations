package main;

public class Student {

	private String surname;
	private String name;
	private String identificationNumber;
	private char gender;
	
	public Student() {
		super();
	}
	public Student(String surname, String name, String identificationNumber, char gender) {
		super();
		this.surname = surname;
		this.name = name;
		this.identificationNumber = identificationNumber;
		this.gender = gender;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return name+" "+surname+", "+gender+", "+identificationNumber;
	}
}
