package Practice_Problems;

import java.util.Scanner;

public class factorial_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int i = 1;
        int factorial = 1;

        while (i<=n){
            factorial *= i;
            i++;
        }
        System.out.println(factorial);
    }
}
