import java.util.Scanner;

public class Converting_days_into_months {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter days : ");
        int days=sc.nextInt();
        int month= days/30;
        int Days=days%30;
        System.out.println(month + " month " + Days + " days ");

    }
}
