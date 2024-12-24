import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = null;


        System.out.println("Choose a shape (Circle or Rectangle): ");
        String choice = scanner.nextLine();


        switch (choice) {
            case "Circle":
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;

            case "Rectangle":
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                System.out.print("Enter the height of the rectangle: ");
                double height = scanner.nextDouble();
                shape = new Rectangle(width, height);
                break;

            default:
                System.out.println("Invalid choice. Please run the program again.");
                System.exit(0);
        }


        if (shape != null) {
            shape.getName();
        }

        scanner.close();
    }
}
