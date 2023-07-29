package Practice_Problems;

public class Sum_of_array_elements {
    public static void main(String[] args) {
        float [] marks = {90.5f, 80, 75.5f, 100, 56, 88.5f};
        float sum = 0;
        for(float element: marks){
            sum = sum + element;
        }
        System.out.println("The sum is " + sum);
    }
}
