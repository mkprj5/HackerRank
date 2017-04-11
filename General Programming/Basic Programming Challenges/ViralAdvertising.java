/*
Viral Advertising
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int sum = 0;
        int val = 5;
        for(int i=0; i<n; i++) {
          sum = sum + val/2;
          val = (val/2)*3;
        }
        System.out.println(sum);
    }
}
