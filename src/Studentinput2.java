import java.util.Scanner;

//4. same as above but pass or fails on the basis of..student needs to pass all the subjects
public class Studentinput2 {
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

        if(math>=35 && chem>=35 && phy>=35){
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
