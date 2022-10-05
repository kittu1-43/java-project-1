import java.util.Scanner;

public class Area {

    public void areaOfCircle(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of radius : ");
        int r= sc.nextInt();
        double pi=3.14;
        double area= 3.14*r*r;
        System.out.println("Area of circle is : "+area);

    }
    public void areaofsquare(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square : ");
        int a= sc.nextInt();
        int area= a*a;

        System.out.println("Area of square is : " +area);

    }

    public void rightAngleTriangle(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base : ");
        int b= sc.nextInt();
        System.out.println("Enter the height : ");
        int h= sc.nextInt();
        int area=(b*h)/2;

        System.out.println("Area of right angle of triangle is :" +area);
    }

    public static void main(String[] args) {
        Area obj= new Area();
        //obj.areaOfCircle();


        //obj.areaofsquare();


        obj.rightAngleTriangle();
    }
}
