public class Precedence_Associativity {
    public static void main(String[] args){
        int x = 6;
        int y = 1;
        int z = x * y/2;  // ans = 3
        System.out.println(z);

        int a = 5;
        int b = 1;
        int c = 4;
        int d = b*b - (4*a*c)/(2*a); // ans = -7
        System.out.println(d);
    }
}

