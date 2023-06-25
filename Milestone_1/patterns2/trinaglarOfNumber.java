package Java.Milestone_1.patterns2;

import java.util.Scanner;

public class trinaglarOfNumber {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                int p = i;
                for (int j = 1; j <= i; j++,p++) {
                    System.out.print(p);
                }
                p = p-2;
                for(int j = 1; j<i;j++,p--){
                    System.out.print(p);
                }
                System.out.println();
            }
        }
    }
}
