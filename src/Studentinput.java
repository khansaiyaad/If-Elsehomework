//3. WAP to input student name, roll no, 3 subjects marks..and find out total, percentage and result if
//he is pass or fail on basis of percentage (pass>=35) and also give them grade
//>= 80 A+
//>= 60 A
//>= 50 B
//>= 35 C
import java.util.Scanner;

public class Studentinput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter student's name: ");
        String name= sc.nextLine();
        System.out.println("Enter student's roll number: ");
        int rollno=sc.nextInt();
        System.out.println("Enter student's marks in maths: ");
        int math=sc.nextInt();
        System.out.println("Enter student's marks in chemistry: ");
        int chem=sc.nextInt();
        System.out.println("Enter student's marks in physics: ");
        int phy=sc.nextInt();

        float total=(math+chem+phy);
        System.out.println("The total marks is: "+total);
        float percent=((total/300)*100);
        System.out.println("Percentage is: "+percent+"%");

        if(percent>=35){
            System.out.println("Student pass.");
            if(percent>=80){
                System.out.println("Grade=A+");
            } else if (percent>=60) {
                System.out.println("Grade=A");
            } else if (percent>=50) {
                System.out.println("Grade=B");
            }else if (percent>=35){
                System.out.println("Grade=C");
            }
        }else{
            System.out.println("Student fail.");
        }

    }
}
