//12. Input any alphabet in uppercase and print it in lowercase
import java.util.Scanner;

public class UppercasetoLowercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter alphabet in Uppercase:");
        String s1=sc.nextLine();
        if (s1==s1.toLowerCase()){
            System.out.println("Already in lowercase");
        }else {
            System.out.println("lowercase is: " + (s1.toLowerCase()));
        }
    }
}
