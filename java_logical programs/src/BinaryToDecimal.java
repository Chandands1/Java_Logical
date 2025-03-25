import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        String binaryStr = input.nextLine();
        try {
            // Convert using Integer.parseInt with base 2
            int decimal = Integer.parseInt(binaryStr, 2);
            System.out.println("Decimal Equivalent: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number. Please enter 0s and 1s only.");
        }
        input.close();
    }
}
