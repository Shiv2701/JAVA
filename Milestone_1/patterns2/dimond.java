package Java.Milestone_1.patterns2;

import java.util.Scanner;

public class dimond {
     public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < n-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < n-i; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j < n-i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
