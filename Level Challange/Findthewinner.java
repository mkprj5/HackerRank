/*
Find the winner
*/
static String winner(int[] andrea, int[] maria, String s) {
        int inc;
        if(s.equals("Even")) {
            inc = 0;
        } else {
            inc  = 1;
        }
        int as = 0;
        int ms = 0;
        while(inc < andrea.length || inc < maria.length) {
            as = as + andrea[inc] - maria[inc];
            ms = ms + maria[inc] - andrea[inc];
            inc = inc + 2;
        }
        
        if(as == ms)
            return "Tie";
        else if(as > ms)
            return "Andrea";
        else 
            return "Maria";

    }
