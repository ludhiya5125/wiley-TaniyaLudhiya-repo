import java.util.Scanner;

public class First{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a positive number (or a negative number to exit): ");
            number = sc.nextInt();

            // Check if the number is negative, if so, exit the loop
            if (number < 0) {
                System.out.println("Exit!");
                break;
            }

            // Process the positive number (here, you can add any specific processing you want)
            System.out.println("You entered: " + number);

        } while (true); // The loop continues indefinitely until break is encountered
    }
}


