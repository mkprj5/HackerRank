/*
HackerRank >General Programming >Basic Programming Challenges> Apple and Orange
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        int ac = 0;
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            int temp = a + apple[apple_i];
            if(temp >= s && temp <= t)
                ac++;
        }
        int[] orange = new int[n];
        int oc = 0;
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            int temp = b + orange[orange_i];
            if(temp >= s && temp <= t)
                oc++;
        }
        System.out.println(ac);
        System.out.println(oc);
        
    }
}
