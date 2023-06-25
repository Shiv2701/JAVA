package Java.Milestone_1.patterns2;

import java.util.Scanner;

public class InvertedNumber {
     public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = i,k=n; j < n; j++,k--) {
                    System.out.print(k);
                }
                System.out.println("");
            }
        }
    }
}
