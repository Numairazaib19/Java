package Strings;

public class string_methods {
    public static void main(String[] args) {
        String st = "Coding";
        System.out.println(st);

        // Length of string
        int value = st.length();
        System.out.println(value);

        // lowercase
        String lst = st.toLowerCase();
        System.out.println(lst);

        // uppercase
        String ust = st.toUpperCase();
        System.out.println(ust);

        // Trimmed string
        String nonTrimmedString = "    Coding     ";
        System.out.println(nonTrimmedString);
        String TrimmedString = nonTrimmedString.trim();
        System.out.println(TrimmedString);

        // sub string
        System.out.println(st.substring(3));
        System.out.println(st.substring(2, 5));  // end index is excluded, i.e. 2 to 4

        // Replace
        String StReplace = st.replace("C", "K");
        System.out.println(StReplace);
        String StReplace1 = st.replace("ing", "er");
        System.out.println(StReplace1);

        // start with
        System.out.println(st.startsWith("Co"));
        System.out.println(st.endsWith("er"));
        System.out.println(StReplace1.endsWith("er"));

        // Character at a given index
        System.out.println(st.charAt(4));
        // Return index of a string first occurrence
        System.out.println(st.indexOf("in"));
        System.out.println(st.indexOf("d", 3)); // return -1 when no match found
        String ModifiedSt = "Codinging";
        System.out.println(ModifiedSt.indexOf("ing", 4));

        // last index return
        System.out.println(ModifiedSt.lastIndexOf("ing"));
        System.out.println(ModifiedSt.lastIndexOf("ing", 4)); // codin => ans 2
        System.out.println(ModifiedSt.lastIndexOf("ing", 7));

        // check string is equal or not
        System.out.println(st.equals("Coding")); // case sensitive

        // equal case ignore
        System.out.println(st.equalsIgnoreCase("codING"));

        // Escape sequence character
        // double quotes
        System.out.println("\" hello java language \"");
        // backslash
        System.out.println("good\\great morning");
        //new line
        System.out.println("hello \n My friend");
        // tab
        System.out.println("Good \t Morning");


    }
}
