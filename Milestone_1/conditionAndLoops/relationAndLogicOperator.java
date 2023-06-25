package Java.Milestone_1.conditionAndLoops;

public class relationAndLogicOperator {
    public static void main(String[]args){
        // These are all relational operators and these give only two answer true or false     
        int a = 10;
        int b = 20;
        System.out.println( a < b );
        System.out.println( a > b );
        System.out.println( a == b );
        System.out.println( a != b );
        System.out.println( a >= b );
        System.out.println( a <= b );
        // these are all logical operators 
        System.out.println( a > b || b > a); // this is or operator it give true if one of them is true
        System.out.println( a > b && b > a); // this is and operator it only give true if both are true
        System.out.println(!( a < b));       // this is not it give the opposite answer 


    }
}
