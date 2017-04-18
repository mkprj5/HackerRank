/*
Picking Numbers
*/

public class PickingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        Arrays.sort(a);
        int max = 0;
        int c = 1;
        for(int i=0;i<n;i++) {
            int ti = a[i];
            for(int j=i+1; j<n; j++) {
                int tj = a[j];
                if(Math.abs( ti - tj ) <= 1) {
                    c++;
                } else {
                    break;
                }
            }
            if(c > max) {
                max = c;
            }
            c = 1;
        }
        System.out.println(max);
    }
}
