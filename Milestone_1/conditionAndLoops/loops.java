package Java.Milestone_1.conditionAndLoops;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int i = 1;

            System.out.println("whole numbers");
            while (n >= i) {
                System.out.println(i);
                i++;
            }

            System.out.println("_______________________");

            System.out.println("natural number");
            for (int k = 0; n >= k; k++) {
                System.out.println(k);
            }

            System.out.println("-----------------");

            System.out.println("Some of n numbers");
            int l = 0;
            for (int k = 1; n >= k; k++) {
                l += k;
            }
            System.out.println(l);

            System.out.println("---------------------");
            System.out.println("Some of odd number till n");

            int h =0;
            for(int k = 0;n>=k;k++){
                if(k%2==0){
                    continue;
                }
                h +=k;
            }
            System.out.println(h);
        }
    }
}
