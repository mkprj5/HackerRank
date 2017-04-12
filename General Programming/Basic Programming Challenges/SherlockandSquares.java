/*
Sherlock and Squares
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner ip = new Scanner(System.in);
        
        int no = ip.nextInt(); 
        
        for(int k=0; k<no; k++) {
            int i = ip.nextInt();
            int j = ip.nextInt();

            int t1 = (int) Math.ceil(Math.sqrt(i));
            int t2 = (int)Math.sqrt(j);

            int count = 0;

            while(t1 <= t2) {
                count++;
                t1++;
            }

            System.out.println(count);
        }
        
    }
}
