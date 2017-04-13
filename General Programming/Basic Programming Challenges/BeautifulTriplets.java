/*
Beautiful Triplets
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        
        ArrayList<Integer> ar = new ArrayList();
        for(int i=0; i<n; i++) {
            ar.add(sc.nextInt());
        }
        
        int count = 0;
        for(int nums: ar) {
            if(ar.contains(nums+d)) {
                if(ar.contains(nums+ 2*d)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
