public class FactorialNumber {
    public static void main(String[] args) {
        int number = 5;
        int result = findFactorial(number);
        System.out.println("The factorial of the number is : "+ result);

    }
    public static int findFactorial(int number){
        int factorial = 1;
        for(int i =1;i<=number;i++){
            factorial = factorial*i;
        }
        return factorial;
    }
}
