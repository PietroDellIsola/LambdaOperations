package main.utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import main.Student;

public class StudentUtils {

	public static Optional<Student> findFirstByNumberPlate(ArrayList<Student> students, String identificationNumber) {
		if(identificationNumber == null
				||(identificationNumber != null && (identificationNumber.equals("") || identificationNumber.equals(" ")))
				|| students == null || (students != null && students.size() == 0)
				)
		{
			return null;
		}
		
		return students.stream().filter(
				student -> identificationNumber.equalsIgnoreCase(student.getIdentificationNumber())).findFirst();
	}
	
	public static List<Student> findAnybyGender(ArrayList<Student> students, char gender) {
		if(students == null || (students != null && students.size() == 0))
		{
			return null;
		}
		
		return students.stream().filter(
				student -> gender == student.getGender()).collect(Collectors.toList());
	}
	
	public static List<Student> orderBySurname(ArrayList<Student> students) {
		Comparator<Student> surnameComparator = ((s1, s2) -> {
			if (s1 == null) {
	            return s2 == null ? 0 : 1;
	        }
	        else if (s2 == null) {
	            return -1;
	        }
			return s1.getSurname().compareTo(s2.getSurname());
		});
		
	    return students.stream().sorted(surnameComparator).collect(Collectors.toList());
	}
	
	public static List<Student> orderByName(ArrayList<Student> students) {
		return students.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
	}
	
	public static List<Student> reverseOrderBySurname(ArrayList<Student> students) {
		Comparator<Student> reverseSurnameComparator  = ((s1, s2) -> {
			if (s2 == null) {
	            return s1 == null ? 0 : 1;
	        }
	        else if (s1 == null) {
	            return -1;
	        }
			
			return s2.getSurname().compareTo(s1.getSurname());
		});
		
	    return students.stream().sorted(reverseSurnameComparator).collect(Collectors.toList());
	}
	
	public static List<Student> reverseOrderByName(ArrayList<Student> students) {
		return students.stream().sorted(Comparator.comparing(Student::getName, Comparator.reverseOrder())).collect(Collectors.toList());
	}
	
	public static boolean surnamesStartWith(ArrayList<Student> students, String startString) {
		return students.stream().anyMatch( s -> s.getSurname().startsWith(startString));
	}
	
	public static long numberOfStudentWithGenderSpecified(ArrayList<Student> students, char gender) {
		return students.stream().filter(s -> gender == s.getGender()).count();
	}
		
}
