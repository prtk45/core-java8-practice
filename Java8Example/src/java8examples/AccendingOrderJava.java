package java8examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AccendingOrderJava {
	public static void main(String args[]) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(80);
		marks.add(70);
		marks.add(45);
		marks.add(65);
		marks.add(65);
		System.out.println(marks);
		System.out.println("Display Marks on Accending Order");
		List<Integer> sortedmarks = marks.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedmarks);
		sortedmarks.stream().forEach(System.out::println);
		System.out.println("Display String on Accesning Order");
		ArrayList<String> name = new ArrayList<String>();
		name.add("AAA");
		name.add("AA");
		name.add("AAAA");
		name.add("A");
		List<String> sortedName = name.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedName);
	}

}
