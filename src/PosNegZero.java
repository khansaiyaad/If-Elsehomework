//8. WAP to input any number and fid our if it is positive , negative or zero
import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        if (number>0){
            System.out.println(number+" is positive");
        } else if (number<0) {
            System.out.println(number+" is negative");
        }else{
            System.out.println(number+" is zero");
        }

    }
}
