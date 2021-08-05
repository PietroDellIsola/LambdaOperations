package main;

import java.util.List;

public class School {
	private List<ClassRoom> classRooms;
	private String name;
	public School() {
		super();
	}
	public School(List<ClassRoom> classRooms, String name) {
		super();
		this.classRooms = classRooms;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<ClassRoom> getClassRooms() {
		return classRooms;
	}
	public void setClassRooms(List<ClassRoom> classRooms) {
		this.classRooms = classRooms;
	}	
}
