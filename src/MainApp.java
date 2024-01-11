import shapes.Rectangle;
import shapes.Square;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Calculate Rectangle Area and Perimeter");
            System.out.println("2. Calculate Square Area and Perimeter");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    handleRectangleCalculation(scanner);
                    break;
                case 2:
                    handleSquareCalculation(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 3);
    }


    private static void handleRectangleCalculation(Scanner scanner) {
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, length);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
    }

    private static void handleSquareCalculation(Scanner scanner) {
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();

        Square square = new Square(side);
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());
    }
}

