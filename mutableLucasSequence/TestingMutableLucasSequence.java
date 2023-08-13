package mutableLucasSequence;


public class TestingMutableLucasSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MutableLucasSequence sequence = new MutableLucasSequence(1, 0, 3, 5);
		System.out.println("Next value: \nExpected result: 8");
		System.out.println("The result: " + sequence.nextValue().toString());
		System.out.println("Previous value: \nExpected result: 5");
		System.out.println("The result: " + sequence.previousValue().toString());
		System.out.println("Previous value: \nExpected result: 3");
		System.out.println("The result: " + sequence.previousValue().toString());

		
		
	}

}
