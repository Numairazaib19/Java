package Practice_Problems;

public class Sum_of_even_numbers_using_while {
    public static void main(String[] args) {
        int sum = 0;
        int n = 3;
        for (int i = 0 ; i < n; i++){
            sum = sum + (2*i);
        }
        System.out.println("Sum of even numbers: " + sum);
    }
}
