//  1. Input any two number and find out its odd or even use ternary operator (? :)
import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {





        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = sc.nextInt();
        System.out.println("Enter second number:");
        int n2 =sc.nextInt();

        String x;
        x=(n1%2==0)?"EVEN":"ODD";
        System.out.println(n1+" is an "+x+" number.");
        x=(n2%2==0)?"EVEN":"ODD";
        System.out.println(n2+" is an "+x+" number.");



    }
}