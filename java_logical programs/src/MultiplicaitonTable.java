import java.util.Scanner;

public class MultiplicaitonTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find the multiples: ");
        int number = input.nextInt();
        printMultiplication(number);
    }
    public static void printMultiplication(int number){
        for( int i = 1; i<=10; i++){
            System.out.println(number + " X "+ i + " = " +(number*i));
        }
    }
}
