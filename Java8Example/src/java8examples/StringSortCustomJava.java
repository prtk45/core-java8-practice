package java8examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSortCustomJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Display String on Custom Order");
		ArrayList<String> name = new ArrayList<String>();
		name.add("AAA BBB");
		name.add("AA BB");
		name.add("AAAA BBBB");
		name.add("A B");
		name.add("A B");
		List<String> sortedName = name.stream().sorted((e1,e2)->e2.compareTo(e1)).collect(Collectors.toList());
		System.out.println(sortedName);
		Comparator<String> c = (e1,e2)-> {
			int l1 = e1.length();
			int l2 = e2.length();
			if(l1>l2) return 1;
			else if(l1<l2) return -1; 
			else return e1.compareTo(e2);
		};
		List<String> customName = name.stream().sorted(c).collect(Collectors.toList());
		System.out.println(customName);
	}

	
}
