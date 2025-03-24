public class GCDNumber {
    public static void main(String[] args) {
        int number1 = 12;
        int number2 = 8;
        checkGCD(number1, number2);
    }
    public static void checkGCD(int number1 ,int number2){
        int gcd =1;
        for(int i = 1;i<= Math.min(number1,number2); i++){
            if(number1 %i ==0 && number2 %i ==0){
                gcd =i;
            }

        }
        System.out.println("The GCD of the numbers is : "+ gcd);
    }

}
