package Loops;

public class Break_and_Continue_using_loops {
    public static void main(String[] args) {
        // break
        for (int i = 1; i<=10; i++){
            System.out.println(i);
            System.out.println("Java World");
        if(i == 4) {
            System.out.println("Ending the loop");
            break;
        }

        }
        System.out.println("loop ends here");




        // continue
        for (int i = 1; i<=10; i++){
            if(i == 4) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java World");

        }
        System.out.println("loop ends here");
    }
}
