package java8examples;

@FunctionalInterface
interface SimpleStringReverseInterface {
	String reverseString(String input);
}

public class SimpleStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "testA";
		String s2 = "";
		char ch;
		for (int i = s1.length() - 1; i >= 0; i--) {
			// System.out.println(s1.charAt(i));
			s2 = s2 + (s1.charAt(i));
			// s2 = (s1.charAt(i)) +s2 ; // it will not reverse , use below sysout to debug and understand
			//System.out.println("Way 1 output Debug is :" + s2);
		}

		System.out.println("Way 1 Final output is :" + s2);
		s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			ch = s1.charAt(i); // extracts each character
			s2 = ch + s2; // adds each character in front of the existing string
			//System.out.println("Reversed word Debug is : " + s2);
		}
		System.out.println("Final Reversed word: " + s2);
		s2 = "";
		System.out.println("Using java 8 Lamda");
		SimpleStringReverseInterface reverseInterface = (input) -> {
			String reversString = "";
			for (int i = 0; i < input.length(); i++) {
				reversString = (input.charAt(i)) + reversString;
			}
			return reversString;
		};
		System.out.println("Using Java 8 Reverse String is " + reverseInterface.reverseString(s1));

	}

}
