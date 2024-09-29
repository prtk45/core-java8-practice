package java8examples;

interface TestInterface1 {
	default void show() {
		System.out.println("Inside show() of TestInterface1");
	}
}

interface TestInterface2 {

	default void show() {
		System.out.println("Inside show() of TestInterface2");
	}
}

public class DefaultMethodExamples implements TestInterface1, TestInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HI");
		TestInterface1 tes1 = new DefaultMethodExamples();
		tes1.show();
		System.out.println("HI 2");
		DefaultMethodExamples defaultMethodExamples = new DefaultMethodExamples();
		defaultMethodExamples.show();

	}
	// We have to override if 2 interface has same default methods

	public void show() {
		System.out.println("OverRide of show on Parent CLass");
		TestInterface1.super.show(); // to call TestInterface1 method
		TestInterface2.super.show(); // to call TestInterface2 Method

	}

}
