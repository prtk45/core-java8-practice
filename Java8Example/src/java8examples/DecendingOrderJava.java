package java8examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DecendingOrderJava {

	public static void main(String args[]) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(80);
		marks.add(70);
		marks.add(45);
		marks.add(65);
		marks.add(65);
		System.out.println(marks);
		System.out.println("Display Marks on Decending Order");
		List<Integer> sortedmarks = marks.stream().sorted((e1,e2)->(e2>e1)?1:(e2<e1) ?-1:0).collect(Collectors.toList());
		System.out.println(sortedmarks);
		sortedmarks.stream().forEach(System.out::println);
		System.out.println("Display String on Dccesning Order");
		ArrayList<String> name = new ArrayList<String>();
		name.add("AAA");
		name.add("AA");
		name.add("AAAA");
		name.add("A");
		List<String> sortedName = name.stream().sorted((e1,e2)->e2.compareTo(e1)).collect(Collectors.toList());
		System.out.println(sortedName);
	}

}
