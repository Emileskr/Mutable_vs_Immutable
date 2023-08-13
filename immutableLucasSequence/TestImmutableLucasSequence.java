package immutableLucasSequence;

import java.math.BigInteger;

public class TestImmutableLucasSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ImmutableLucasSequence fib = new ImmutableLucasSequence(1, 0, 3, 5);
		BigInteger bi = fib.getValue();
		System.out.println("The value: " + bi.toString());
		System.out.println("Next value: \nExpected: 8");
		fib = fib.getNext();
		bi = fib.getValue();
		System.out.println("The value: " + bi.toString());
		System.out.println("Previous value: \nExpected: 3");
		fib = fib.getPrevious().getPrevious();
		bi = fib.getValue();
		System.out.println("The value: " + bi.toString());
		System.out.println("Next next value: \nExpected: 13");
		fib = fib.getNext().getNext().getNext();
		bi = fib.getValue();
		System.out.println("The value: " + bi.toString());
	}

}
