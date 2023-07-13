public class increment_decrement_quiz {
    public static void main(String[] args) {
        // quiz 1
        int y = 7;
        int x = ++y * 8;  // first y is incremented then multiply by 8
        System.out.println(x);    // so, x = 64

        // quiz 2
        char a = 'E';
        char b = a++;
        char c = a;
        char d = ++a;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
