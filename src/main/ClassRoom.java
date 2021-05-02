package main;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {

	private String name;
	private List<Student> students;
	public ClassRoom() {
		super();
	}
	public ClassRoom(String name, ArrayList<Student> students) {
		super();
		this.name = name;
		this.students = students;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> list) {
		this.students = list;
	}
}
