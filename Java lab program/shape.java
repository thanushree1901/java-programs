2. Develop a Java program for a Shape class where the area() method is overloaded to calculate the 
area of:
a circle
a rectangle
a triangle
Accept dimensions from the user
	import java.util.Scanner;

class Shape {

    // Area of Circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of Rectangle
    public double area(double length, double breadth) {
        return length * breadth;
    }

    // Area of Triangle
    public double area(float base, float height) {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();

        System.out.println("===== AREA CALCULATOR =====");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                System.out.println("Area of Circle = " + shape.area(radius));
                break;

            case 2:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();

                System.out.print("Enter breadth: ");
                double breadth = sc.nextDouble();

                System.out.println("Area of Rectangle = " + shape.area(length, breadth));
                break;

            case 3:
                System.out.print("Enter base: ");
                float base = sc.nextFloat();

                System.out.print("Enter height: ");
                float height = sc.nextFloat();

                System.out.println("Area of Triangle = " + shape.area(base, height));
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
} 
         
	 
 
