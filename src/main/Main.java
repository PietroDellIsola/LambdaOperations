package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import main.utils.StudentUtils;

public class Main {

	public static void main(String[] args) {
		
		ClassRoom cr = new ClassRoom();
		cr.setName("5A - IT");
		cr.setStudents(returningStudents());
		
		System.out.println("The student with the IdentificationNumber = 0000123 is:\n"
				+StudentUtils.findFirstByNumberPlate(cr.getStudents(), "0000123").get());
		System.out.println("----------------------------------------------------------");
		
		System.out.println("The female students are:");
		StudentUtils.findAnybyGender(cr.getStudents(), 'F').forEach(System.out::println);
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Students ordered by surname:");
		StudentUtils.orderBySurname(cr.getStudents()).forEach(System.out::println);
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Students ordered by name:");
		StudentUtils.orderByName(cr.getStudents()).forEach(System.out::println);
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Students ordered reverse by surname:");
		StudentUtils.reverseOrderBySurname(cr.getStudents()).forEach(System.out::println);
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Students ordered reverse by name:");
		StudentUtils.reverseOrderByName(cr.getStudents()).forEach(System.out::println);
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Are there any students with surname that starts with \"X\"?");
		System.out.println(StudentUtils.surnamesStartWith(cr.getStudents(), "X") == true ? "Yes" : "No");
		System.out.println("----------------------------------------------------------");
		
		System.out.println("How many male students are there in class?");
		System.out.println(StudentUtils.numberOfStudentWithGenderSpecified(cr.getStudents(), 'M'));
		System.out.println("----------------------------------------------------------");
		
		School school = new School();
		school.setName("");
		ArrayList<ClassRoom> classRooms = new ArrayList<ClassRoom>();
		classRooms.add(cr);
		school.setClassRooms(classRooms);
		school.setName("Hogwarts");

		System.out.println("Finding Harry Potter in "+school.getName());
		Optional.ofNullable(StudentUtils.findStudentsInSchool(school, "0000005"))
		.ifPresent(v -> v.forEach(System.out::println));
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Finding Hermione Granger and Ron Weasley in "+school.getName());
		Optional.ofNullable(StudentUtils.findStudentsInSchool(school, "0000155", "0000123"))
		.ifPresent(v -> v.forEach(System.out::println));
		System.out.println("----------------------------------------------------------");
		
	}
	
	private static List<Student> returningStudents() {
		List<Student> students = new ArrayList<Student>();
		Student s1 = new Student();
		s1.setGender('M');
		s1.setName("Ron");
		s1.setSurname("Weasley");
		s1.setIdentificationNumber("0000123");
		students.add(s1);
		
		Student s2 = new Student();
		s2.setGender('F');
		s2.setName("Hermione");
		s2.setSurname("Granger");
		s2.setIdentificationNumber("0000155");
		students.add(s2);
		
		Student s3 = new Student();
		s3.setGender('M');
		s3.setName("Harry");
		s3.setSurname("Potter");
		s3.setIdentificationNumber("0000005");
		students.add(s3);
		
		Student s4 = new Student();
		s4.setGender('F');
		s4.setName("Ginevra");
		s4.setSurname("Weasley");
		s4.setIdentificationNumber("0000122");
		students.add(s4);
 
		Student s5 = new Student();
		s5.setGender('M');
		s5.setName("Neville");
		s5.setSurname("Paciock");
		s5.setIdentificationNumber("0000117");
		students.add(s5);
 
		Student s6 = new Student();
		s6.setGender('M');
		s6.setName("Draco");
		s6.setSurname("Malfoy");
		s6.setIdentificationNumber("0000088");
		students.add(s6);

		Student s7 = new Student();
		s7.setGender('M');
		s7.setName("George");
		s7.setSurname("Weasley");
		s7.setIdentificationNumber("0000009");
		students.add(s7);
		
		return students;
	}

}
