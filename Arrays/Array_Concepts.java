package Arrays;

public class Array_Concepts {
    public static void main(String[] args) {
        //float [] marks = {90.5f, 80, 75.5f, 100, 56, 88.5f};
        //String [] marks = {"nemo", "lily", "milli"};
        int [] marks = {90, 80, 75, 100, 56, 88};
        System.out.println(marks.length);

        //Displaying the array using naive way
        System.out.println("Naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);

        // Displaying the array using for loop
        // array traversal
        System.out.println("using For loop");
        for(int i=0; i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("Reverse order");
        for(int i=marks.length-1; i>=0;i--){
            System.out.println(marks[i]);
        }

        // Using for each loop
        System.out.println("using for each loop");
        for(int element: marks){
            System.out.println(element);
        }
    }
}
