package Practice_Problems;
import java.util.Scanner;
import java.util.Random;
public class Rock_paper_scissor {
        public static void main(String[] args) {
            // User Choice

            System.out.println("Choose any one of them");
            System.out.println("1 --> Rock");
            System.out.println("2 --> Paper");
            System.out.println("3 --> Scissor");
            Scanner sc = new Scanner(System.in);
            int user_choice = sc.nextInt();
            if(user_choice == 1){
                System.out.println("You choose Rock!");
            }
            else if(user_choice == 2){
                System.out.println("You choose Paper!");
            }
            else if(user_choice == 3){
                System.out.println("You choose Scissor!");
            }

            // Computer Choice

            Random r = new Random();
            int computer_choice = r.nextInt(1, 4);
            //  System.out.println(computer_choice);
            if(computer_choice == 1){
                System.out.println("Computer choose Rock!");
            }
            else if(computer_choice == 2){
                System.out.println("Computer choose Paper!");
            }
            else if(computer_choice == 3){
                System.out.println("Computer choose Scissor!");
            }

            // Comparison

            if(computer_choice == user_choice){
                System.out.println("Its a TIE");
            }
            else if(computer_choice == 1 && user_choice == 2){
                System.out.println("Its Paper, You WON!");
            }
            else if(computer_choice == 1 && user_choice == 3){
                System.out.println("Its Rock, You LOSE!");
            }
            else if(computer_choice == 2 && user_choice == 1){
                System.out.println("Its Paper, You LOSE!");
            }
            else if(computer_choice == 2 && user_choice == 3){
                System.out.println("Its Scissor, You WON!");
            }
            else if(computer_choice == 3 && user_choice == 1){
                System.out.println("Its Rock, You WON!");
            }
            else if(computer_choice == 3 && user_choice == 2){
                System.out.println("Its Scissor, You LOSE!");
            }
            else{
                System.out.println("Sorry, Your choice was Wrong!");
            }
        }
}


