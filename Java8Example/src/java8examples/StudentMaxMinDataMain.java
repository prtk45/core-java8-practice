package java8examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

public class StudentMaxMinDataMain {
	
	
	public static void main(String[] args) {
		
		List<StudentMaxMinData> listStudentMaxMinData = Arrays.asList(new StudentMaxMinData("name1",12), new StudentMaxMinData("name2",23)
				, new StudentMaxMinData("name3",34));
				
		System.out.println("Max by Age Way 1-> "+listStudentMaxMinData.stream().mapToInt(StudentMaxMinData :: getAge).max());
		OptionalInt a = listStudentMaxMinData.stream().mapToInt(StudentMaxMinData :: getAge).max();
		int aa = a.getAsInt();
		System.out.println("Max by Age Way 1-> "+aa);
		StudentMaxMinData maxData = listStudentMaxMinData
				.stream().max(Comparator.comparingInt(StudentMaxMinData :: getAge))
				.get();
		System.out.println("Max by Age Way 2-> "+maxData.getAge() + " of name "+ maxData.getName());
		
	}

}
