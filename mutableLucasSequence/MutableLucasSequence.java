package mutableLucasSequence;

import java.math.BigInteger;

/**
 * program calculates the next or previous values of various Lucas sequences
 * @author Emile
 *
 */
public class MutableLucasSequence {

	private int a1;
	private int b1;
	private BigInteger previous;
	private BigInteger current;

	/**
	 * constructor
	 * @param a
	 * @param b
	 * @param x0 - current value
	 * @param x1 - previous value
	 */
	public MutableLucasSequence(int a, int b, int x0, int x1) {
		a1 = a;
		b1 = b;
		current = BigInteger.valueOf(x1);
		previous = BigInteger.valueOf(x0);
	}

	/**
	 * calculates the next value of the sequence
	 * @return the next value
	 */
	private BigInteger calcNextValue() {
		BigInteger productPreviousAN = previous.multiply(BigInteger.valueOf(a1)); 
		BigInteger productCurrentABN = current.multiply(BigInteger.valueOf(a1 + b1));
		BigInteger sum = productPreviousAN.add(productCurrentABN); 
		return sum;
	}

	/**
	 * gives the next value and renews the previous value
	 * @return current value
	 */
	public BigInteger nextValue() {
		BigInteger calculation = calcNextValue();
		previous = current;
		current = calculation;
		return current;
	}

	/**
	 * calculates the previous value
	 * in this case the "next" value is now "current", and "current" value is now "previous"
	 * @return the previous value
	 */
	private BigInteger calcPreviousValue() {
		
		BigInteger productCurrentAB = previous.multiply(BigInteger.valueOf(a1 + b1));
		BigInteger productNextA = current.subtract(productCurrentAB);
		BigInteger result = (productNextA).divide(BigInteger.valueOf(a1));
		return result;
	}

	/**
	 * gives the previous values and renews the current and previous values
	 * @return the current value
	 */
	public BigInteger previousValue() {
		BigInteger calculation = calcPreviousValue();
		current = previous;
		previous = calculation;

		return current;
	}
}
