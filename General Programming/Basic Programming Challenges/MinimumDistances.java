/*
Minimum Distances
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
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        int minD = Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++) {
            if(map.containsKey(A[i])){
                int temp = Math.abs(map.get(A[i]) - i);
                if(temp < minD) {
                    minD = temp;
                }
            } else {
                map.put(A[i],i);
            }
        }
        if(minD == Integer.MAX_VALUE)
            minD = -1;
        System.out.println(minD);
    }
}
