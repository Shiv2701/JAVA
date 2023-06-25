package Java.Milestone_1.howDataIsStored;

public class typecasting {
    public static void main(String[] args){
        // all decimals are by default stored in double
        // we can implicitly convert any smaller value into bigger value but we can't do the opposite 
        // to store a bigger value in smaller we can do it explicitly 
        char c = 'a';   // all char are stored in there ascii value
        int i = c + 5;  // as char is 2 byte long and int is 4 byte long we can convert this implicitly 
        System.out.println(i);
        c = (char)i;    // we have done it explicitly now because char is smaller than int 
        System.out.println(c);
        c =(char)(i+5); // this is how we can do addition while doing explicit conversion
        System.out.println(c);

        float p = 1.6f; // we have to write f at the end while writing float because by default decimal is a double value
        System.out.println(p+i);    // this will give answer in the bigger value which is float here
        System.out.println(2/5);    // this answer will be in int value 
        System.out.println((double)2/5);    // but if we change one of them to double now this will give answer in double 
        // similar case hold for all the calculation  


    }
}
