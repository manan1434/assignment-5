/*
 Name:Priyanshi Faldu
 PRN:23070126042
 Batch:AIML A2
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n=== Shape Calculator ===");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    circle.displayResults();
                    break;
                case 2:
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    rectangle.displayResults();
                    break;
                case 3:
                    System.out.print("Enter side: ");
                    double side = scanner.nextDouble();
                    Square square = new Square(side);
                    square.displayResults();
                    break;
                case 4:
                    System.out.print("Enter radius: ");
                    double sphereRadius = scanner.nextDouble();
                    Sphere sphere = new Sphere(sphereRadius);
                    sphere.displayResults();
                    break;
                case 5:
                    System.out.print("Enter radius: ");
                    double cylRadius = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    Cylinder cylinder = new Cylinder(cylRadius, height);
                    cylinder.displayResults();
                    break;
                case 6:
                    System.out.print("Enter base side: ");
                    double baseSide = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double pyramidHeight = scanner.nextDouble();
                    EquilateralPyramid pyramid = new EquilateralPyramid(baseSide, pyramidHeight);
                    pyramid.displayResults();
                    break;
                case 7:
                    System.out.println("Exiting program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
        
        scanner.close();
    }
}
