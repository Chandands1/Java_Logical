public class PallindromeNumber {
    public static void main(String[] args) {
        int number =124;
       int result =  checkPallindrome(number);
       if(number == result){
           System.out.println("The number is Pallindrome! : "+ number);
       }else {
           System.out.println("The number is not Pallindrome! : "+ number);
       }
    }
    public static int checkPallindrome(int number){
        int reverse =  0;
        while(number!=0){
            int digit = number%10;
            reverse = reverse*10+ digit;
            number = number/10;
        }
        return reverse;
    }
}
