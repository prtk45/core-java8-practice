package java8examples;

import java.text.Collator;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateJava {
	public static void main(String args[]) {
		System.out.println("Print Duplicate");
		List<String> list1 = Arrays.asList("1","2","3","1");
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = list1.stream().filter(e->(!set1.add(e))).collect(Collectors.toSet());
		System.out.println(set2);
		System.out.println("Remove Duplicate");
		Stream<Integer> strm = Stream.of(1,2,1);
		Set<Integer> setInt = strm.map(s->s).collect(Collectors.toSet());
		System.out.println(setInt);
		
		System.out.println("Remove Duplicate String");
		Stream<String> strmString = Stream.of("1","2","1");
		Set<String> stString = strmString.map(s->s).collect(Collectors.toSet());
		System.out.println(stString);
		
	}

}
