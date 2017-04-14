/*
Append and Delete
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        
        System.out.println(checkStr(s,t,k)?"Yes":"No");
    }
    
    
    public static boolean checkStr(String s, String t, int k) {
        
        if(s.length() + t.length() <= k)
            return true;
        
        int idx = 0;
        for(int i=0; i<s.length() && i<t.length(); i++) {
            if(s.charAt(i) == t.charAt(i)){
                idx++;
            } else {
                break;
            }
        }
        
        int remOp = (s.length() - idx) + (t.length() - idx);
        
        if(remOp <= k && (k - remOp)%2 == 0 ) {
            return true;
        } else {
            return false;
        }
    }
}
 
