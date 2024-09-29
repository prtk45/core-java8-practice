package java8examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccuranceOfChar {
	public void usingJava7HashMap(String str) {
		//String str = "google";
		// HashMap char as a key and occurrence as a value
		HashMap<Character, Integer> charCount = new HashMap<>();
		for (int i = str.length() - 1; i >= 0; i--) {
			if (charCount.containsKey(str.charAt(i))) {
				int count = charCount.get(str.charAt(i));
				charCount.put(str.charAt(i), ++count);
			} else {
				charCount.put(str.charAt(i), 1);
			}
		}
		System.out.println(charCount);
	}
	public void usingJava8Method1(String str) {
		/*
		 * In the following Java program, we have used the Java 8 features. First, we
		 * have initialized a string of which occurrence of the character is to be
		 * counted. After that, we have created an instance of the Java Map<>. We have
		 * performed various intermediate operations to get the occurrence of the
		 * character.
		 * 
		 * First, the given string is split into the array by using the String.split()
		 * method. After that, the Arrays.stream() method returns a stream of the passed
		 * array.
		 * 
		 * The second intermediate operation is to convert the string into lowercase
		 * letters. For the same, we have used the Stream.map() method that returns a
		 * stream consisting of the results of applying the given function to the
		 * elements of this stream.
		 * 
		 * The collect() function is used to perform a mutable reduction operation and
		 * concatenate the list elements. The Collectors.groupingBy() method returns a
		 * Collector implementing a cascaded "group by" operation on input elements of
		 * type T.
		 * 
		 * In order to count the elements, we have used the counting() method of the
		 * Collectors class. The method returns a Collector accepting elements of type
		 * T. It counts the number of input elements, if no elements are present, the
		 * result is 0.
		 * 
		 * Java 8 identity function Function.identity() returns a Function that always returns it’s input argument.
		 *  In this article we will see various examples using Function.identity() . -- s->s
		 */
		System.out.println("Using Java 8");
		Map<String, Long> result = Arrays.stream(str.split(""))
				.map(String::toLowerCase)//.sorted((n1,n2)->n2.length()>n1.length()?1:n2.length()<n1.length()?0:0)
				.collect(Collectors
						.groupingBy(s -> s, LinkedHashMap::new,
								Collectors.counting()));
		System.out.println(result);
		Map<String, Long> result_update = Arrays.stream(str.split(""))
		.map(s->s)
		.collect(Collectors.groupingBy(
				(s->s),Collectors.counting()));
		System.out.println("Using Java 8 of result_update");
		
		System.out.println(result_update);
		
		
		//Stream  a = Arrays.stream(str.split("")).map(String::toLowerCase);
		//a.forEach(System.out::println);
		List<String> s = Arrays.stream(str.split("")).map(String::toLowerCase).collect(Collectors.toList());
		System.out.println("Here "+s);
		List<String> g = Arrays.asList("geeks");
		/*
		 * Map result2 = g.stream(str.split("")) .map(String::toLowerCase)
		 * .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 * System.out.println(result2);
		 */
	}
	public static void main(String args[]) {
		CountOccuranceOfChar countOccuranceOfChar = new CountOccuranceOfChar();
		String input ="gooogle";
		countOccuranceOfChar.usingJava7HashMap(input);
		countOccuranceOfChar.usingJava8Method1(input);
	}

}
