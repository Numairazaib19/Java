package Practice_Problems;
import java.util.Scanner;
public class Exam_result_Conditionals {
    public static void main(String[] args) {
        int m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in physics: ");
        m1 = sc.nextByte();
        System.out.println("Enter your marks in Maths: ");
        m2 = sc.nextByte();
        System.out.println("Enter your marks in Chemistry: ");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Overall percentage" + avg);

        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}
