package Java.Milestone_1.patterns;

import java.util.Scanner;

public class characterPattern2 {
       public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = i,k=0; k < n; j++,k++) {
                    System.out.print((char)(j+65));
                }
                System.out.println("");
            }
        }
    }
}
