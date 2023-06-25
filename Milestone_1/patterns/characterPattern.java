package Java.Milestone_1.patterns;

import java.util.Scanner;

public class characterPattern {
     public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print((char)(j+65));
                }
                System.out.println("");
            }
        }
    }
}
