package Java.Milestone_1.patterns;

import java.util.Scanner;

public class characterPattern3 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0, k = i; j <= i; j++,k--) {
                    System.out.print((char)(n+64-k));
                }
                System.out.println("");
            }
        }
    }
}
