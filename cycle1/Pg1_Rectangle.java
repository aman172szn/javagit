import java.util.Scanner;

public class Pg1_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Enter the length and breadth of the Rectangle: ");
            double length = sc.nextDouble();
            double width = sc.nextDouble();

            double area = length * width;
            double perimeter = 2 * (length + width);

            System.out.println("The Area of Rectangle is: " + area);
            System.out.println("The Perimeter of Rectangle is: " + perimeter);

            System.out.println("Do you want to calculate another rectangle? (y/n): ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("stopped.");
        sc.close();
    }
}
