public class RightTriangle extends Triangle {
    public RightTriangle() {
    }

    public RightTriangle(double side1,double side2) {
        super(side1, side2);
    }

    protected double area(){
        return a*b/2.0;
    }

    protected double perimeter(){
        double third = Math.sqrt(a*a + b*b);
        return super.a + super.b + third;
    }

    public String displayName()  {
        return "Right Triangle (" +a+", "+b+")";
    }

}

