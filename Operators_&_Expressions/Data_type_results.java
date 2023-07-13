public class Data_type_results {
    public static void main(String[] args) {
        byte a = 5;
        int b = 8;
        short c = 2;
        float x = 8.65f + a;
        int y = a + c;
        //System.out.println(x);
        //System.out.println(y);
        System.out.println(x + " is of type " + ((Object)x).getClass().getSimpleName());
        System.out.println(y + " is of type " + ((Object)y).getClass().getSimpleName());


    }
}
