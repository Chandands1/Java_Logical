public class Swap2Numbers {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        System.out.println("The number before swapping: "+ number1 + " "+ number2);
        swap(number1,number2);
    }
    public static void swap(int number1, int number2){
        number1 = number1+number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println("The number after before swapping: "+ number1 + " "+ number2);

    }
}
