import java.util.Scanner;

public class ExamMarksInPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of subject1: ");
        float s1 = sc.nextFloat();
        System.out.println("Enter marks of subject2: ");
        float s2 = sc.nextFloat();
        System.out.println("Enter marks of subject3: ");
        float s3 = sc.nextFloat();
        System.out.println("Enter marks of subject4: ");
        float s4 = sc.nextFloat();
        System.out.println("Enter marks of subject5: ");
        float s5 = sc.nextFloat();

        float sum = s1 + s2 + s3 + s4 + s5;
        float percent = (sum*100)/500;
        System.out.println("Percentage = " + percent + "%");
    }
}