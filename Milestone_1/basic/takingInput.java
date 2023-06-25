package Java.Milestone_1.basic;
import java.util.Scanner;// library for input

public class takingInput {
    public static void main(String[] args){
        try (Scanner s = new Scanner(System.in)) {
            int a = s.nextInt();
            int b = s.nextInt();// s.next[type] to store a varaible of specific data type
            String l = s.next();// take only continues input
            int c = a+b;
            char k = l.charAt(0);// take char at the define position
            System.out.println(c);
            System.out.print(k);
        }
    }
    
}
