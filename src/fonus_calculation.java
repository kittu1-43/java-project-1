import java.util.Scanner;

public class fonus_calculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter basic salary : ");
        int basic= sc.nextInt();

        double DA= basic*0.15;
        double TA= basic*0.1;
        double HRA= basic*0.2;
        double PF= basic*0.12;

        if (basic>=20000){


            double bonus= basic* 0.1;
            double grossSalary= basic + DA + TA + HRA + bonus - PF;
            System.out.println(grossSalary);
        }
        else {
            double bonus= basic* 0.2;
            double grossSalary= basic + DA + TA + HRA + bonus - PF;
            System.out.println(grossSalary);
        }



    }
}
