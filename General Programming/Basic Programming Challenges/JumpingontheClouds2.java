/*
Jumping on the Clouds
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
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        
        int step = 0;
        boolean flag = true;
        for(int i=0; i<n; i++) {
            
            if(i+1 < n && (c[i+1] == 0 || c[i+1] == 1) ) {
                if(i+2 < n && c[i+2] == 0) {
                    i++;
                    step++;
                } else {
                    step++;
                }
            }
        }
        System.out.print(step);
    }
}
