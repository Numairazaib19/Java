package Practice_Problems;
import java.util.Scanner;
public class Leap_year {
    public static void main(String[] args) {
        System.out.println("Enter year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100!=0|| year % 400==0){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
    }
}
