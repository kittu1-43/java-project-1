import java.util.Scanner;

public class Arithmatic { // + - * / %


    public void add()
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter any two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = num1+num2;
        System.out.println("Addition = " + result);
    }

    public int sub(int a , int b)
    {
        return (a-b);
    }

    public int mul(int a, int b){
        return(a*b);
    }
    public void divide(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1= sc.nextInt();
        int num2 = sc.nextInt();

        int result= num1/num2;
        System.out.println("Division of " + num1 + " and " + num2 + " is " + result);
    }

    public static void main(String[] args) {

//        Scanner sc  = new Scanner(System.in);
       Arithmatic obj = new Arithmatic();
//        // obj.add();
//
//        System.out.println("Enter any two numbers");
//        int num1= sc.nextInt();
//        int num2= sc.nextInt();
//        // int result = ;
//       // System.out.println("Subtraction = " + obj.sub(num1,num2));

        //System.out.println("Multiplication = " + obj.mul(num1,num2));
        obj.divide();
    }
}
