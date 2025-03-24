public class PrimeNumber {
    public static void main(String[] args) {
        int number = 6;
      int result =  checkPrime(number);
      if(result ==2){
          System.out.println("The number is prime! : "+ number);
      }else {
          System.out.println("The number is not prime! : "+ number);
      }
    }
    public static int checkPrime(int number){
        int count = 0;
        for(int i =1; i<= number;i++){
            if(number%i==0){
                count++;
            }
        }
        return count;
    }
}
