public class Operators_03 {
    public static void main(String[] args) {
        // Arithmetic operator
        int a = 5;
        int b = 6*a;
        System.out.println(b);

        // Modulo operator
        int c = 5;
        int d = 6 % a;
        System.out.println(d);

        // Assignment operators
        int e = 8;
        e += 2;
        System.out.println(e);

        // Comparison operators
        System.out.println(12==12);
        System.out.println(57>90);

        // logical operators
        System.out.println(45<70 && 90<101);
        System.out.println(45<70 && 90>101);
        System.out.println(45<70 || 90>101);

        // bitwise operator
        System.out.println(2&3);
        // 2 in binary 10
        // 3 in binary 11
        //            -----
        //             10 => 2
        System.out.println(9|3);
        // 2 in binary 1001
        // 3 in binary   11
        //            -----
        //             1011 => 11
    }
}
