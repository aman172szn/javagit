
 

import java.util.Scanner;

public class Prg7_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do{
        
        System.out.print("Enter number to check if Armstrong or not : ");
        int n = sc.nextInt();
        int og = n;
        int arm = 0;
        while(n>0) {
            int digit=n%10;
            arm = digit*digit*digit + arm;
            n = n/10;
        }
        if (arm == og) {
            System.out.println("The number is a Armstrong.");
        } else {
            System.out.println("The number is not a Armstrong.");
        }
        System.out.println("Do you want to check another number? (y/n): ");
        choice = sc.next().charAt(0);
    }while(choice == 'y' || choice == 'Y');
    System.out.println("stopped.");
    sc.close();
    }
}

