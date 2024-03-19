//14. Enter any value and the find out if it is number (0-9) or an alphabet or symbol
import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value: ");
        char x=sc.next().charAt(0);
        if  ((x >='a' && x <='z')||(x >='A'&& x <='Z')){
            System.out.println("Entered value is a alphabet.");
        } else if(x >='0'&& x <='9'){
            System.out.println("Entered value is an number");
        }else{
            System.out.println("Entered value is a symbol.");
        }
    }
}
