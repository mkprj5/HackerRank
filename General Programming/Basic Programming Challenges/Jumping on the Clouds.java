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
        int k = in.nextInt();
        int tc = 0;
        for(int i = 0; i < n; i++) {
            int tmp = in.nextInt();
            if((i % k == 0) && tmp == 1)
                tc++;            
        }
        System.out.println(100 - (n / k) - (2 * tc));        
    }
}
