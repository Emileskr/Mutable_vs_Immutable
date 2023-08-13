package immutableLucasSequence;

import java.math.BigInteger;

/**
 * Program which computes the next or previous value of the Lucas Sequence
 * @author Emile
 *
 */
public class ImmutableLucasSequence {

	final private BigInteger a1;
	final private BigInteger b1;
	final private BigInteger current;
	final private BigInteger previous;
	
	/**
	 * constructor which takes int values
	 * @param a - constant a
	 * @param b - constant b
	 * @param x0 - the first value of the sequence
	 * @param x1 - the second value of the sequence
	 */
	public ImmutableLucasSequence (int a, int b, int x0, int x1) {
		a1 = BigInteger.valueOf(a);
		b1 = BigInteger.valueOf(b);
		current = BigInteger.valueOf(x1);
		previous = BigInteger.valueOf(x0);
		
	}
	
	/**
	 * constructor which takes BigInteger values
	 * @param a - constant a
	 * @param b - constant b
	 * @param x0 - the first value of the sequence
	 * @param x1 - the second value of the sequence
	 */
	public ImmutableLucasSequence (BigInteger a, BigInteger b, BigInteger x0, BigInteger x1) {
		a1 = a;
		b1 = b;
		current = x1;
		previous = x0;
		
	}
	
	
	/**
	 * calculates the next value of the sequence
	 * @return the next value
	 */
	private BigInteger calcNextValue() {
		BigInteger productPreviousAN = previous.multiply(a1); 
		BigInteger productCurrentABN = current.multiply(a1.add(b1));
		BigInteger sum = productPreviousAN.add(productCurrentABN); 
		return sum;
	}
	
	/**
	 * makes new ImmutableLucasSequence object with new values, calculating the next one
	 * @return ImmutableLucasSequence with new values
	 */
	public ImmutableLucasSequence getNext () {
		BigInteger nextValue = calcNextValue();
		return new ImmutableLucasSequence(a1, b1, current, nextValue);
	}
	
	
	/**
	 * calculates the previous value
	 * in this case the "next" value is now "current", and "current" value is now "previous"
	 * @return the previous value
	 */
	private BigInteger calcPreviousValue() {
		
		BigInteger result = (current.subtract(previous.multiply(a1.add(b1))).divide(a1));
//		BigInteger productCurrentAB = previous.multiply(a1.add(b1));
//		BigInteger productNextA = current.subtract(productCurrentAB);
//		BigInteger result = (productNextA).divide(a1);
		return result;
	}
	
	/**
	 * makes new ImmutableLucasSequence object with new values, calculating the previous one
	 * @return ImmutableLucasSequence with new values
	 */
	public ImmutableLucasSequence getPrevious () {
		BigInteger previousValue = calcPreviousValue();
		return new ImmutableLucasSequence(a1, b1, previousValue, previous);
	}
	
	/**
	 * gets the current value of the sequence
	 * @return - the current value
	 */
	public BigInteger getValue () {
		return current;
	}
	
	
}
