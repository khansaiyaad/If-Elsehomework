//5. WAP to input any two numbers and then print their interchanged value

import java.util.Scanner;

public class ValueInterchanged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number A= ");
        int num1=sc.nextInt();
        System.out.println("Enter the second number B= ");
        int num2=sc.nextInt();
        int x=0;
        x=num1;
        num1=num2;
        num2=x;
        System.out.println("Value of A= "+num1);
        System.out.println("Value of B= "+num2);
    }

}
