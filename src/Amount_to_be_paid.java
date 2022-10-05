import java.util.Scanner;

public class Amount_to_be_paid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter price per item : ");
        int price=sc.nextInt();
        System.out.print("Enter quantity : ");
        int quantity= sc.nextInt();

        int total= price*quantity;

        if(quantity>=10){
            double toBePaid=total - total*(0.1);
            System.out.println("final amount to be paid is : " + toBePaid);
        }
        else{
            System.out.println("final amount to be paid is : " +total);
        }
    }
}
