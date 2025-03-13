import java.util.Scanner;

public class Pg2_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Enter the radius of the Circle: ");
            double radius = sc.nextDouble();

            double area = Math.PI * radius * radius;
            double perimeter = 2 * Math.PI * radius;

            System.out.println("The Area of Circle is: " + area);
            System.out.println("The Perimeter of Circle is: " + perimeter);

            System.out.println("Do you want to calculate another circle? (y/n): ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("stopped.");
        sc.close();
    }
}
