public class CountTheDigits {
    public static void main(String[] args) {
        int number = 54321123;
        countNumber(number);
    }
    public static void countNumber(int number){
        int count = 0;
        while(number!=0){
            number = number/10;
            count++;
        }
        System.out.println("The number of digits are: "+ count);
    }
}
