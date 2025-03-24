public class CheckAlphabet {
    public static void main(String[] args) {
        char ch = 9;
        checkChar(ch);
    }
    public static void checkChar(char ch){
        if(Character.isLetter(ch)){
            System.out.println(ch + " is an alphabet ");
        }else{
            System.out.println(ch + " is not an alphabet ");
        }
    }

}
