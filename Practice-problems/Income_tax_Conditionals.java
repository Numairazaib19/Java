package Practice_Problems;
import java.util.Scanner;
public class Income_tax_Conditionals {
    public static void main(String[] args) {
        System.out.println("Enter income In Lakhs per annum: ");
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        float tax = 0;
        //float income = 3.3f;
        if (income<=2.5){
            tax = tax + 0;
        }
        else if (income>2.5 && income<=5.0){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if (income>5.0 && income<=10.0) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);

        }
        else if (income>10.0) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);

        }
        System.out.println("paid tax " + tax);

    }
}
