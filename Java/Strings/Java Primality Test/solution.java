// https://github.com/Utkarsh299-tech

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       BigInteger n = sc.nextBigInteger();
       sc.close();
       
       System.out.println(n.isProbablePrime(10) ? "prime" : "not prime");
    }
}

/*
EXPLANATION: REFERENCE(https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html#isProbablePrime%28int%29)

isProbablePrime

public boolean isProbablePrime(int certainty)
Returns true if this BigInteger is probably prime, false if it's definitely composite. If certainty is ≤ 0, true is returned.
Parameters:
certainty - a measure of the uncertainty that the caller is willing to tolerate: if the call returns true the probability that this BigInteger is prime exceeds (1 - 1/2certainty). 
The execution time of this method is proportional to the value of this parameter.
Returns:
true if this BigInteger is probably prime, false if it's definitely composite.

isProbablePrime() with certainty = 10 to achieve 99.9% accuracy. 
However, even certainty = 1 (which achieves 50% accuracy) is enough to 
pass the HackerRank test cases.
*/
