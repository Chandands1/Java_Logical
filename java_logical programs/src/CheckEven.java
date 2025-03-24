import java.util.Scanner;

public class CheckEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check even or odd: ");
        int number = input.nextInt();
        isEven(number);
    }
    public static void isEven(int number){
        if(number%2==0){
            System.out.println("The number is even: "+ number);
        }else {
            System.out.println("The number is odd: "+number);
        }
    }
}
