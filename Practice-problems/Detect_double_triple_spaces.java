package Practice_Problems;

public class Detect_double_triple_spaces {
    public static void main(String[] args) {
        String st = "My string contains  double and triple  spaces";
        System.out.println(st.indexOf("  "));
        System.out.println(st.indexOf("   "));
    }
}
