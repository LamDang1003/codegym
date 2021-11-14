package _5_access_modifier_static.exercise.e1;

public class Circle {
    private double radius= 1;
    private String color= "red";

    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius*3.14;
    }
}
