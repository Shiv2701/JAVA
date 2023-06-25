package Java.Milestone_1.patterns2;

import java.util.Scanner;

public class isoscelesTriangle {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n-i-1; j++) {
                    System.out.print(" ");
                }
                for(int j=1;j<=i+1;j++){
                    System.out.print(j);
                }
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println("");
            }
        }
    }
}