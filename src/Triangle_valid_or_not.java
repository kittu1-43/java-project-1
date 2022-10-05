import java.util.Scanner;

public class Triangle_valid_or_not {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 3 angles : ");
        int angle1=sc.nextInt();
        int angle2= sc.nextInt();
        int angle3=sc.nextInt();

        if(angle1+angle2+angle3 == 180){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Invalid Trianle");
        }
    }
}
