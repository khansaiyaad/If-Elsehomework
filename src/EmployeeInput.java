
//6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
//HRA = basic salary 10%
//DA = Basic salary 8%
//TA = Basic salary 9%
//PF= Basic salary 20%
//Gross salary = basic salary + HRA + TA + DA -PF
 import java.util.Scanner;
public class EmployeeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        String name= sc.nextLine();
        System.out.println("Enter the Employee ID: ");
        int num1=sc.nextInt();
        System.out.println("Enter basic salary: ");
        int bsalary=sc.nextInt();

        double hra=(bsalary*(0.1));
        System.out.println("HRA is: "+hra);
        double da=((0.08)*bsalary);
        System.out.println("DA is: "+da);
        double ta=((0.09)*bsalary);
        System.out.println("TA is: "+ta);
        double pf=((0.2)*bsalary);
        System.out.println("PF is: "+pf);
        double gross= (bsalary+hra+ta+da-pf);
        System.out.println("Gross salary is: "+gross);

    }
}
