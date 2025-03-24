public class SumOfDigits {
    public static void main(String[] args) {
        int number = 1234524;
        checkSum(number);
    }
    public static void checkSum(int number){
        int sum = 0;
        while (number!=0){
            int digit = number %10;
            sum = sum + digit;
            number = number/10;


        }
        System.out.println("The sum of the number is: "+ sum);
    }
}
