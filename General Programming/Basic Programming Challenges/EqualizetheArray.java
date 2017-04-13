/*
Equalize the Array
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
        int[] ar = new int[n];
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            ar[i] = sc.nextInt();
            if(!map.containsKey(ar[i])){
                map.put(ar[i],1);
            } else {
                map.put(ar[i], map.get(ar[i])+1);
            }
        }
        int max=(Collections.max(map.values())); 
        
        System.out.print(n-max);
        
    }
}
