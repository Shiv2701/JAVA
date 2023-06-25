package Java.Milestone_1.patterns;

import java.util.Scanner;

public class triangularPattern3 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 0, k = i; j < i; j++, k++) {
                    System.out.print(k);
                }
                System.out.println("");
            }
        }
    }
}
