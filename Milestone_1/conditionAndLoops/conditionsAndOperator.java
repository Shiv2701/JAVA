package Java.Milestone_1.conditionAndLoops;
import java.util.Scanner;

public class conditionsAndOperator {
    public static void main(String[]args){
        try (Scanner s = new Scanner(System.in)) {
            int a,b;
             a = s.nextInt();
             b = s.nextInt();       
            // This is condition
            if(a>b){
                System.out.println("We are inside if");
            }else{
                System.out.println("we are inside else");
            }
            // This is codition with operators 
            if(a>0 || b>0){
                System.out.println("Both of them are not negative");
            }else{
                System.out.println("Both of them are negative");
            }
        }
    }
}
