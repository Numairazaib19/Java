package Practice_Problems;

public class Basic_Name_replace_In_letter {
    public static void main(String[] args) {
        String letter = "Dear <|Name|>, Thanks a lot!";
        letter = letter.replace("<|Name|>", "Nemo");
        System.out.println(letter);
    }
}
