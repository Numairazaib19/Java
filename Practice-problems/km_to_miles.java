import java.util.Scanner;

public class km_to_miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter km value: ");
        float km = sc.nextInt();
        float mile = km*0.621371f;
        System.out.println(km + "km = " + mile + "miles");
    }
}