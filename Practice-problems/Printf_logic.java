package Practice_Problems;

public class Printf_logic {
    public static void main(String[] args) {
        int a = 4;
        float b = 5.987653f;
        System.out.printf("The value of a is %d and the value of b is %.3f ",a,b ); // .3 donates that it shows only 3 decimal points
        System.out.println();
        System.out.printf("The value of a is %d and the value of b is %8.3f",a,b); // 8 shows spaces
    }
}