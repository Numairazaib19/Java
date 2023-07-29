package Practice_Problems;

import java.util.Scanner;

public class Sum_of_table_values_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1 ; i<11 ; i++){
            System.out.println(n + "*" + i + "=" + n*i);
            sum = sum + (n*i);
            continue;

        }
        System.out.println("Sum of all Values: " + sum);
    }
}
