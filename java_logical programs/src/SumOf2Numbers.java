import java.util.Scanner;

public class SumOf2Numbers {
    public static int sum(int number1, int number2){
        return (number1+number2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.println("The sum of the 2 numbers are: "+ sum(number1,number2));
    }
}
