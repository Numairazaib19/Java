package Loops;
import java.util.Scanner;
public class do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Starting From: ");
        int a = sc.nextInt();
        System.out.println("End limit: ");
        int b = sc.nextInt();
        do{
            System.out.println(a);
            a++;
        }while (a<=b);

    }
}
