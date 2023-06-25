package Java.Milestone_1.conditionAndLoops;
import java.util.Scanner;
public class nestedConditions {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int a = s.nextInt();
            int b = s.nextInt();
            if(a>b){
                System.out.println("First is greater");
            }else if(a<b){
                System.out.println("Second is greater");
            }else{
                System.out.println("Both are equals");
            }
        }
    }
}