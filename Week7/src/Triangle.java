public class Triangle {
    protected double a, b, c;
    public Triangle() {

    }

    public Triangle(double side) {
        a=b=c=side;
    }

    public Triangle(double side1, double side2) {
        a=side1;
        b=side2;
    }

    public Triangle(double side1, double side2, double side3) {
        a=side1;
        b=side2;
        c= side3;
    }

    protected double perimeter() {
        return a+b+c;
    }

    protected double area(){
        double p = this.perimeter()/2.0;
        double work = p*(p-a)*(p-b)*(p-c);
        return Math.sqrt(work);
    }

    public String displayName()  {
        return "Triangle (" +a+", "+b+", "+c+")";
    }
}