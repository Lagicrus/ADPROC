public class Triangle {
    protected double side_1;
    protected double side_2;
    protected double side_3;

    public Triangle(double side_a, double side_b, double side_c){
        side_1 = side_a;
        side_2 = side_b;
        side_3 = side_c;
    }

    public Triangle(double side_a, double side_b){
        side_1 = side_a;
        side_2 = side_b;
    }

    public Triangle(double side_a){
        side_1 = side_a;
    }

    protected double perimeter(){
        return side_1 + side_2 + side_3;
    }

    protected double area(){
        return perimeter() / 2;
    }
}
