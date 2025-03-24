public class LeapYearCheck {
    public static void main(String[] args) {
        int year = 2024;
        checkLeapYear(year);
    }
    public static void checkLeapYear(int year){
        if((year%400==0)||(year%4==0 && year%100!=0)){
            System.out.println("The year is leap year! : "+ year);
        }else{
            System.out.println("The year is not leap year! : "+ year);
        }

    }
}
