public class FibonacciSeries {
    public static void main(String[] args) {
        int number = 10;
        generateFibonocci(number);
    }
    public static void generateFibonocci(int number){
        int num1 = 0;
        int num2 =1;
        System.out.print(num1+" "+ num2);
        for (int i = 2;i<number;i++){
            int next = num1+num2;
            System.out.print(" "+next);
            num1 = num2;
            num2 = next;
        }
        System.out.println();
    }
}
