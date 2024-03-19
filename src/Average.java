//7. WAP input any five number and then find average of five numbers
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter five numbers: ");
        float n1=sc.nextInt();
        float n2=sc.nextInt();
        float n3=sc.nextInt();
        float n4=sc.nextInt();
        float n5=sc.nextInt();
        System.out.println("The average of five numbers is: "+((n1+n2+n3+n4+n5)/5));
    }
}
