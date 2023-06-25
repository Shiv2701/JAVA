package Java.Milestone_1.conditionAndLoops;
import java.util.Scanner;
public class primeNumber {
    public static void main(String[]args){
        try(Scanner s = new Scanner(System.in)){
            int n = s.nextInt();
            int flag = 0;
            for(int k=2 ; k<n/2;k++){
                if(n%k==0){
                    System.out.println("composite number");
                    flag = 1;
                    break;
                }
            }
            if(flag!=1){
                System.out.println("Prime number");
            }
        }
    }
}
