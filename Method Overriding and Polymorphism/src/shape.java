import java.util.Scanner;

abstract public class shape {
    abstract void CalculateArea();


}
class circle extends shape{

    double radius=5;


     void CalculateArea(){
         System.out.println("enter radius");
         Scanner sr=new Scanner(System.in);
         double radius= sr.nextInt();
        double area=radius*radius*Math.PI;
         System.out.println("circle CalculatedArea: "+area);
    }
}
class Rectangle extends shape{

    @Override
    void CalculateArea() {
        System.out.println("enter length");

        Scanner sr=new Scanner(System.in);
        double length= sr.nextInt();
        System.out.println("enter width");
        Scanner si=new Scanner(System.in);
        double width= si.nextInt();

        double area=length*width;
        System.out.println("rectangle CalculatedArea: "+area);
    }
}
class triangle extends shape{


    @Override
    void CalculateArea() {
        System.out.println("enter base");

        Scanner sr=new Scanner(System.in);
        double base= sr.nextInt();
        System.out.println("enter height");
        Scanner si=new Scanner(System.in);
        double height= si.nextInt();
       double Tare=0.5*base*height;
        System.out.println("triangle CalculatedArea:"+Tare);

    }
}
