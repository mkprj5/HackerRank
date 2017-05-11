/*
Mars Exploration
*/

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        int n = S.length()/3;
        int j = 0;
        int count = 0;
        for(int i=0; i<n; i++) {
            String temp = S.substring(j, j+3);
            j = j+3;
            if(temp.charAt(0) != 'S') {
                count++;
            }
            if(temp.charAt(1) != 'O') {
                count++;
            }
            if(temp.charAt(2) != 'S') {
                count++;
            }
        }
        System.out.println(count);
    }
}
