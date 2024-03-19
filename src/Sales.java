//9. WAP input sales id, seller's name, sales amount, salary basic and then find this sales
//commission
//sales amount >= 50,000 35%
//sales amount >= 30,000 20%
// >= 20,000 10%
// >= 10,000 5%
// < 10,000 2%


import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter seller name:");
        String name=sc.nextLine();
        System.out.println("Enter sales ID:");
        int saleid=sc.nextInt();
        System.out.println("Enter sales amount:");
        int saleamt=sc.nextInt();
        System.out.println("Enter basic salary:");
        int bsalary=sc.nextInt();
        if (saleamt>=50000){
            System.out.println("sales commission: "+(0.35*saleamt));
        } else if (saleamt>=30000) {
            System.out.println("sales commission: "+(0.2*saleamt));
        } else if (saleamt>=20000) {
            System.out.println("sales commission: "+(0.1*saleamt));
        } else if (saleamt>=10000) {
            System.out.println("sales commission: "+(0.05*saleamt));
        }else {
            System.out.println("sales commission: "+(0.02*saleamt));
        }
    }
}
