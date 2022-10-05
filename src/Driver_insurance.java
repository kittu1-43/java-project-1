import java.util.Scanner;

public class Driver_insurance {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Marriage status : ");
        String status= sc.nextLine();


        if(status.equals("married")){
            System.out.println("Gets insurance");
        }
        else if(status.equals("unmarried")){
                System.out.print("Enter gender ");
                String gender=sc.nextLine();
                if (gender.equals("male")){
                    System.out.print("Enter the age");
                    int age=sc.nextInt();
                    if (age>30)
                    {
                        System.out.println("Gets insurance");
                    }
                    else {
                        System.out.println("Will not get insurance");
                    }
                }
                else if (gender.equals("female")) {
                    System.out.print("Enter the age");
                    int age=sc.nextInt();
                    if (age>25)
                    {
                        System.out.println("Gets insurance");
                    }
                    else {
                        System.out.println("Will not get insurance");
                    }

                }
                else {
                    System.out.println("Will not get insurance");
                }
        }
        else {
            System.out.println("Will not get insurance");

        }


    }
}


















