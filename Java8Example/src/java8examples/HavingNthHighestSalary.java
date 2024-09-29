package java8examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HavingNthHighestSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentMaxMinData> listStudentMaxMinData = Arrays.asList(new StudentMaxMinData("name1",12,1000), new StudentMaxMinData("name2",23,2000)
				, new StudentMaxMinData("name3",34,3000));
		System.out.println("Way 1");
		int nThSalary = listStudentMaxMinData.stream().map(e -> e.getSal())
		.sorted((s1,s2)->s2.compareTo(s1)).skip(1).findFirst().get(); // skip(1) means 2nd high, skip(2) 3rd HIgh
		System.out.println("Way 1 "+nThSalary);
		
		Optional<Integer> nthSalaryWay2 = listStudentMaxMinData.stream().map(e -> e.getSal())
		.sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println("Way 2 "+nthSalaryWay2.get());
		
		System.out.println(listStudentMaxMinData.stream().map(e->e).collect(Collectors.groupingBy(s-> s.getName(),Collectors.counting())));
	}

}
