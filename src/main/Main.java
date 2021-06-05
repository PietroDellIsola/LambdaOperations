package main;

import java.util.ArrayList;
import java.util.List;

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
		for (Student s: StudentUtils.findAnybyGender(cr.getStudents(), 'F'))
		{
			System.out.println(s);
		}
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Students ordered by surname:");
		for (Student s: StudentUtils.orderBySurname(cr.getStudents()))
		{
			System.out.println(s);
		}
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Students ordered by name:");
		for (Student s: StudentUtils.orderByName(cr.getStudents()))
		{
			System.out.println(s);
		}
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Students ordered reverse by surname:");
		for (Student s: StudentUtils.reverseOrderBySurname(cr.getStudents()))
		{
			System.out.println(s);
		}
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Students ordered reverse by name:");
		for (Student s: StudentUtils.reverseOrderByName(cr.getStudents()))
		{
			System.out.println(s);
		}
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Are there any students with surname that starts with \"X\"?");
		System.out.println(StudentUtils.surnamesStartWith(cr.getStudents(), "X") == true ? "Yes" : "No");
		System.out.println("----------------------------------------------------------");
		
		System.out.println("How many male students are there in class?");
		System.out.println(StudentUtils.numberOfStudentWithGenderSpecified(cr.getStudents(), 'M'));
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
