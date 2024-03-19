import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a alphabet: ");
        char x=sc.next().charAt(0);
        if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
            System.out.println("alphabet is a vowel.");
        }else{
            System.out.println("alphabet is a consonant.");
        }
    }
}
