/*
Beautiful Days at the Movies
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int i = ip.nextInt();
        int j = ip.nextInt();
        int k = ip.nextInt();
        
        String temp = "";
        int count = 0;
        for(int t=i; t<= j; t++) {
            temp = String.valueOf(t);
            temp = new StringBuffer(temp).reverse().toString();
            int t2 = Integer.valueOf(temp);
            t2 = Math.abs(t-t2);
            if(t2%k == 0) 
                count++;
        }
        System.out.println(count);
    }
}
