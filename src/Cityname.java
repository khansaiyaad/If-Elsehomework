//10. Input any alphabet from a to f and print their city name accordingly (use if else) any other
//alphabet should be invalid entry
import java.util.Scanner;

public class Cityname {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the letter: ");
        char letter=sc.next().charAt(0);
if (letter=='a'|| letter=='A'){
            System.out.println("Ctiy is Agra");
        }else if (letter=='b'||letter=='B'){
            System.out.println("City is Bombay");
        }else if (letter=='c'||letter=='C'){
    System.out.println("City is Calcutta");
        } else if (letter=='d'||letter=='D') {
    System.out.println("City is Delhi");
} else if (letter=='e'||letter=='E') {
    System.out.println("City is Edinburgh");
}else if (letter=='f'||letter=='F'){
    System.out.println("City is Florida");
}else{
    System.out.println("Invalid Entry");
}
    }
}
