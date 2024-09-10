import java.util.Scanner;
public class AreaCalculator {
    public static void calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
    public static void calculateArea(float length, float width) {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
    public static void calculateArea(double base, double height) {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Circle.");
        System.out.println("Enter 2 for Rectangle.");
        System.out.println("Enter 3 for Triangle.");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter Radius of Circle:");
                double radius = sc.nextDouble();
                calculateArea(radius);
                break;
            case 2:
                System.out.println("Enter Length of Rectangle:");
                double length = sc.nextDouble();
                System.out.println("Enter Width of Rectangle:");
                double width = sc.nextDouble();
                calculateArea(length, width);
                break;
            case 3:
                System.out.println("Enter Base of Triangle:");
                double base = sc.nextDouble();
                System.out.println("Enter Height of Triangle:");
                double height = sc.nextDouble();
                calculateArea(base, height);
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }
}