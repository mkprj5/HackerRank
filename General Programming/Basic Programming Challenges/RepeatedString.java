/*
Repeated String
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        
        long ca = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'a') {
                ca++;
            }
        }
        
        long t = n/s.length();
        t = t * ca;
        
        long j = n % (long)s.length();
        
        for(long i=0; i<j; i++) {
            if(s.charAt((int)i) == 'a') {
                t++;
            }
        }
        
        System.out.println(t);
    }
}
