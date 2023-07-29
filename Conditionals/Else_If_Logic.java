package Conditionals;

import java.util.Scanner;

public class Else_If_Logic {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>30){
            System.out.println("You are Experienced!");
        }
        else if (age>25) {
            System.out.println("You are semi experienced");
        }
        else if (age>20) {
            System.out.println("you are semi-semi experienced");
        }
        else {
            System.out.println("you are not experienced");

        }
    }
}
