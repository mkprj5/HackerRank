/*
HackerRank - Project Euler #2: Even Fibonacci numbers
*/
public class EvenFibonaccinumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long index = 0;
            long next = 1;
            long incr = 0;
            long sum=0;
            while(incr + index <= n){
                incr = index + next;
                System.out.println("Fibo is: "+incr);
                index = next;
                next = incr;
                if(incr%2 == 0) {
                    sum = sum + incr;
                    System.out.println("Sum is: "+sum);
                }
            }
            System.out.println(sum);
        }
    }
}
