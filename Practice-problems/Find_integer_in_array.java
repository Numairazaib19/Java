package Practice_Problems;

public class Find_integer_in_array {
    public static void main(String[] args) {
        float [] marks = {90.5f, 80, 75.5f, 100, 56, 88.5f};
        float num = 81;
        boolean isInArray = false;
        for (float element: marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("Yes, Present");
        }
        else{
            System.out.println("Not present");
        }
    }
}
