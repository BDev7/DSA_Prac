// File: Circle.java

import java.util.Scanner;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double circumference() {
        return 2 * Math.PI * this.radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("The area of the circle is: " + circle.area());
        System.out.println("The circumference of the circle is: " + circle.circumference());
    }
}
