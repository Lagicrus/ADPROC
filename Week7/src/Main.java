import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        Triangle first = new Triangle(2.0, 4.0, 5.0); //object of the super class

        System.out.println("first area = "+first.area());
        System.out.println("\t first perimeter = "+first.perimeter());

        RightTriangle righty = new RightTriangle(3.0,4.0); //object of the subclass

        System.out.println("righty area = " + righty.area());
        System.out.println("\t righty perimeter = " + righty.perimeter());

        EquilateralTriangle equilaty = new EquilateralTriangle(2.0); //object of the subclass

        System.out.println("equilaty area = " + equilaty.area());
        System.out.println("\t equilaty perimeter = " + equilaty.perimeter());

        Triangle last = new  RightTriangle(2.0,3.0); //pay attention - object of the subclass

        System.out.println("last area = " + last.area()); //RightTriangle area() will be executed
        System.out.println("\t last perimeter = " + last.perimeter());
    }

}