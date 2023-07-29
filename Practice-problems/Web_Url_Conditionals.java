package Practice_Problems;
import java.util.Scanner;
public class Web_Url_Conditionals {
    public static void main(String[] args) {
        System.out.println("Enter url: ");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if (website.endsWith(".org")){
            System.out.println("Organizational website");
        }
        else if (website.endsWith(".com")){
            System.out.println("Commercial website");
        }
        else if (website.endsWith(".pk")){
            System.out.println("Pakistan website");
        }

    }
}
