public class LargestOf3Number {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 40;
        int number3 = 100;
        findLargest(number1, number2, number3);
    }
    public static void findLargest(int number1, int number2, int number3){
        if(number1>number2&& number1>number3){
            System.out.println("The largest number is : "+ number1);
        }else if (number2> number1&& number2>number3){
            System.out.println("The largest number is : "+ number2);
        }else{
            System.out.println("The largest number is : "+ number3);
        }
    }
}
