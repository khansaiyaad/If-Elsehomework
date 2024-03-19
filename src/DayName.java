import java.util.Scanner;

//15. WAP input any number, the print Day name of the week accordingly by using if else import java.util.Scanner;
public class DayName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number of day:");
        int number=sc.nextInt();
        if(number==1){
            System.out.println("The day is Sunday.");
        } else if (number==2) {
            System.out.println("The day is Monday.");
        } else if (number==3) {
            System.out.println("The day is Tuesday.");
        } else if (number==4) {
            System.out.println("The day is Wednesday.");
        } else if (number==5) {
            System.out.println("The day is Thursday.");
        } else if (number==6) {
            System.out.println("The day is Friday.");
        } else if (number==7) {
            System.out.println("The day is Saturday.");
        }else{
            System.out.println("invalid entry");
        }
    }
}
