/*
Climbing the Leaderboard
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
        int[] scores = new int[n];
        ArrayList<Integer> ar = new ArrayList<Integer>();
        
        for(int scores_i=0; scores_i < n; scores_i++){
            int t = in.nextInt();
            if(ar.isEmpty() || ar.get(ar.size()-1) != t){
                ar.add(t);
            } 
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        int i=ar.size()-1;
        int c = i+2;
        for(int alice_i=0; alice_i < m; alice_i++){
           int t2 = in.nextInt();
           for(;i >= 0; i--) {
               int temp = ar.get(i);
               if(t2 >= temp) {
                   c--;
               } else {
                   break;
               }
           }
          
           System.out.println(c);
            
        }
}
}
