/*
Consecutive 1's in Binary Numbers
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String t = Integer.toBinaryString(n);
        
        int max = 0;
        for(int i=0; i<t.length(); i++) {
            if(t.charAt(i) == '1') {
                int count = 1;
                for(int j=i+1; j<t.length(); j++) {
                    if(t.charAt(j) == '1'){
                        count++;
                    } else {
                        break;
                    }
                }
                
                if(count > max) {
                    max = count;
                }
            }
        }
        System.out.println(max);
    }
}
