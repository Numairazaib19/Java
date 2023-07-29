package Conditionals;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch (age){
            case 18:
                System.out.println("Adult!");
                break;
            case 25:
                System.out.println("Silver Jubilee!");
                break;
            case 50:
                System.out.println("Golden Jubilee!");
                break;
            case 100:
                System.out.println("A Century!");
                break;
            default:
                System.out.println("Enjoy Every day");

        }

        String weather = "Cloudy";
        switch (weather){
            case "Cloudy" -> {
                System.out.println("I like this weather");
                System.out.println("Clouds looks so pretty");
            }
            case "Rainy" -> {
                System.out.println("Water everywhere");
                System.out.println("Sand smell");
            }
        }
    }
}
