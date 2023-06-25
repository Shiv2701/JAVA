package Java.Milestone_1.patterns;

import java.util.Scanner;

public class numberSquare {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = n; j > 0; j--) {
                    System.out.print(j);
                }
                System.out.println("");
            }
        }
    }
}
