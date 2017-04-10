/*
HackerRank >General Programming >Basic Programming Challenges> Library Fine
*/
import java.util.Scanner;
public class LibraryFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ad = sc.nextInt();
        int am = sc.nextInt();
        int ay = sc.nextInt();
        
        int ed = sc.nextInt();
        int em = sc.nextInt();
        int ey = sc.nextInt();
        
        int fine = 0;
        if(ay == ey) {
            if(em < am) {
                fine = 500 * (am - em);
            }
            else if (em == am && ed < ad) {
                fine = 15 * (ad - ed);
            }
        }
        else if(ey < ay)
            fine = 10000;
                
        System.out.println(fine);
    }
}
