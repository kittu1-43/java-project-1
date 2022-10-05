import java.util.Scanner;

public class Greater_Betwen_Two_No {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st No. ");
        int num1=sc.nextInt();
        System.out.print("Enter 2nd No. ");
        int num2= sc.nextInt();

        if(num1>num2){
            System.out.println("1st no. is greater");
        }
        else{
            System.out.println("2nd no. is greater");
        }
    }
}
