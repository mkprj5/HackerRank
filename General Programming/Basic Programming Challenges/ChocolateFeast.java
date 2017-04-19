/*
Chocolate Feast
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            
            int money = n/c;
            int temp = money;
            while(temp >= m) {
                int tr = temp/m;
                money += tr;
                temp = temp%m + tr;
                
            }
            System.out.println(money);
            
        }
    }
}
