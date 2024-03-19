//13. WAP to input enter any two number and ask user to enter their symbol (+, -, /, *) find addition,
//        subtraction, multiplication and division according to their symbol (using if else)
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1=sc.nextInt();
        System.out.println("Enter second number: ");
        int n2=sc.nextInt();
        System.out.println("Enter a symbol: ");
        char symbol=sc.next().charAt(0);
        if (symbol=='+'){
            System.out.println("Addition:"+(n1+n2));
        }else if (symbol=='-'){
            System.out.println("Subtraction:"+(n1-n2));
        } else if (symbol=='*') {
            System.out.println("Multiplication:"+(n1*n2));
        } else if (symbol=='/') {
            System.out.println("Division:"+(n1/n2));
        }else{
            System.out.println("Invalid Symbol");
        }
    }
}
