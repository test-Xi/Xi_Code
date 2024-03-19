package SelfStudy;

public class Circle {
    private double radius;
    private final double PI = 3.14;

    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double areaCalculate(){
        if(this.radius == 0){
            System.out.println("该圆未进行初始化！");
            return 0;
        }
        double area = PI*this.radius*this.radius;
        return area;
    }

    public double circleCalculate(){
        if(this.radius == 0){
            System.out.println("该圆未进行初始化！");
            return 0;
        }
        double circle = 2*PI*this.radius;
        return circle;
    }
}
