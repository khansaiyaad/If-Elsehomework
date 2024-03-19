//11. Write Java program to allow the user to input his/her age. Then the program will show if the
//person is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years
//old.
import java.util.Scanner;

public class EligibiltyToVote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:");
        int age=sc.nextInt();
        if (age>=18){
            System.out.println("Eligible to vote.");
        }else{
            System.out.println("NOT Eligible to vote.");
        }
    }
}
