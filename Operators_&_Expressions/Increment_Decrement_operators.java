public class Increment_Decrement_operators {
    public static void main(String[] args) {
        int i = 55;
        System.out.println(i++);  // ans = 55 // first print i value then increment (first i used then increment)
        System.out.println(i);    // ans = 56 // return value after increment
        System.out.println(++i);  // ans = 57 // first i is incremented the value then print
        System.out.println(i);    // ans = 57 // return last value
    }
}
