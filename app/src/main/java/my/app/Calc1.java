package my.app;

import java.math.BigInteger;

import com.google.common.math.BigIntegerMath;

public class Calc1 {

	public static long factorial(double d) {
	    long fact = 1;
	    for (int i = 2; i <= d; i++) {
	        fact = fact * i;
	    }
	    return fact;
	}
	
	
	public static BigInteger factorialUsingGuava(int d) {
	    return BigIntegerMath.factorial(d);
	}
	
	public static BigInteger binomialUsingGuava(int n, int k ) {
	    return BigIntegerMath.binomial(n, k);
	}
	
	public static void main(String[] args) {
		
//		System.out.println("Factorial of       10 ="+factorial(0.50));
		
		System.out.println("Factorial Using Guava ="+factorialUsingGuava(2150));
		
		System.out.println("Binomial coefficient , 15, 5 = "+binomialUsingGuava(15,5));

	}

}
