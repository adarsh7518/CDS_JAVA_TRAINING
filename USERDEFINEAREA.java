import java.util.Scanner;

public class USERDEFINEAREA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        calculateRectangleProperties(length, breadth);
    }

    /**
     * Calculates the area and perimeter of a rectangle.
     *
     * @param length  the length of the rectangle
     * @param breadth the breadth of the rectangle
     */
    public static void calculateRectangleProperties(double length, double breadth) {
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}