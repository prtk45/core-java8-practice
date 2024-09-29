package java8examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

	/*
	 * map() method is = The key point to note here is that the function used by the
	 * map() operation returns a single value.
	 */
	/*
	 * flatmap() method is = Now, if the map operation uses a function which instead
	 * of returning a single value returns a Stream of values like when you give a
	 * number and it returns all prime factors ( prime factor of 12 is 4,3 ) of the
	 * number then you have a Stream of Stream of integers
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> teamIndia = Arrays.asList("Virat", "Dhoni", "Jadeja");
		List<String> teamAustralia = Arrays.asList("Warner", "Watson", "Smith");

		List<List<String>> playersInWorldCup2016 = new ArrayList<>();
		// before java 8
		playersInWorldCup2016.add(teamIndia);
		playersInWorldCup2016.add(teamAustralia);
		// Let's print all players before Java 8
		List<String> listOfAllPlayers = new ArrayList<>();
		for (List<String> team : playersInWorldCup2016) {
			for (String name : team) {
				listOfAllPlayers.add(name);
			}
		}
		System.out.println("Players playing in world cup 2016 before Java 8");
		System.out.println(listOfAllPlayers);

		// Let's print all players on Java 8

		List<String> flatMapList = playersInWorldCup2016.stream().flatMap(pList -> pList.stream())
				.collect(Collectors.toList());
		System.out.println("Players playing in world cup 2016 On Java 8");
		System.out.println(flatMapList);

		
		// flatMap() function with provided operation of mapping string with character at position 2.
		// Creating a List of Strings
		List<String> list = Arrays.asList("Geeks", "GFG", "GeeksforGeeks", "gfg");
		// Using Stream flatMap(Function mapper)
		list.stream().flatMap(str -> Stream.of(str.charAt(2))).forEach(System.out::println);
		
		
		// Creating a list of Prime Numbers
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);          
        // Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);          
        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);
  
        List<List<Integer>> listOfListofInts = Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);
  
        System.out.println("The Structure before flattening is : " +listOfListofInts);
          
        // Using flatMap for transformating and flattening.
        List<Integer> listofInts  = listOfListofInts.stream()
                                    .flatMap(listData -> listData.stream())
                                    .collect(Collectors.toList());
  
        System.out.println("The Structure after flattening is : " +listofInts);
     
	}

}
