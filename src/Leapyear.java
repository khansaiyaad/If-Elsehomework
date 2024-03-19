//2. WAP to input any year like 1989 and find out if it is leap year
import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        if(year%4==0 && year%100!=0 || year%400==0 ){
            System.out.println(year+" is a leap year.");
        }else {
            System.out.println(year+" is not a leap year.");
        }
    }
}
