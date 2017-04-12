/*
Extra Long Factorials
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n));
    }
    static BigInteger factorial(int n) {
        BigInteger mul = new BigInteger("1");
        
        for(int i=2; i<=n; i++) {
            mul = mul.multiply(BigInteger.valueOf(i));
        }
        
        return mul;
    }
}
