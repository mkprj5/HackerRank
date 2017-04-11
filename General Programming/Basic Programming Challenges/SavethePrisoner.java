/*
Save the Prisoner
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x= 0; x < t; x++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            
            int res = 0;
            
            if(m>n)
                m = m%n;
            
            res = m+s-1;
            
            if(res > n)
                res = res%n;
            
            System.out.println(res);
            
        }
    }
}
