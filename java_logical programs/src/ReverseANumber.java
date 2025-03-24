public class ReverseANumber {
    public static void main(String[] args) {
        int number = 12345;
        int result = reversingNumber(number);
        System.out.println("The original number is : "+number);
        System.out.println("The reversed number is : "+ result);
    }
    public static int reversingNumber(int number){
        int reverse =0;
        while(number!=0){
            int digit = number %10;
            reverse = reverse*10+digit;
            number= number/10;
        }
        return reverse;
    }
}
