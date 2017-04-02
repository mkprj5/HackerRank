/*
HackerRank Solution Java - Project Euler #6: Sum square difference
*/
public class SumSquarDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n = t;
        
        double sumsq = (double) (n*(n+1)/2);
        sumsq = sumsq*sumsq;
        
        
        double sqsum = (double) n*(n+1)*(2*n+1);
        sqsum = sqsum/6;
        
        
        double dif = sumsq-sqsum;
        long mdif = new Double(dif).longValue();


        System.out.println(mdif);
    }
}
