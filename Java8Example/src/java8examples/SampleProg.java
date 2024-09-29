package java8examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SampleProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);

		// using filter odd even way 1
		List<Integer> output = list1.stream().filter(n1 -> ((n1) % 2 == 0)).collect(Collectors.toList());
		System.out.println(output);
		// using filter odd even way 2
		output.forEach(System.out::println);

		List<Integer> outList2 = list1.stream().map(n1 -> n1 * n1).collect(Collectors.toList());
		outList2.forEach(System.out::println);

		// using map and forEach example
		Map<String, Integer> samMap = new HashMap<String, Integer>();
		samMap.put("A", 10);
		samMap.put("B", 20);
		samMap.put("C", 30);
		samMap.put(null, 40);
		samMap.put(null, 4);
		samMap.put("E", null);
		samMap.put("F", 60);
		samMap.put("G", null);
		samMap.put("A", null);//its overwrite previous value
		// HashMap allows one null key and multiple null values, if we add another null
		// key then it will replace previous one
		samMap.forEach((k, v) -> System.out.println("Key is =" + k + " Value is =" + v));
		// print where != null
		samMap.forEach((k, v) -> {
			if (k != null) {
				System.out.println("Key is =" + k + " Value is =" + v);
			}
		});
		samMap.forEach((k,v)->{
			if(k!=null) {
				System.out.println("updated Key is =" + k + " updated Value is =" + v);
			}
		});

	}
}
