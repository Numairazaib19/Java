package Practice_Problems;

public class Max_element_in_an_array {
    public static void main(String[] args) {
        // maximum number
        int [] arr = {1, 30, 2, 500, 50, -981, 60};
        int max = Integer.MIN_VALUE;
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("the value of the maximum element in this array is: "+ max);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        // minimum number
        int [] arr1 = {1, 30, 2, 500, 50, -981, 60};
        int min = Integer.MAX_VALUE;
        for(int e: arr1){
            if(e<min){
                min = e;
            }
        }
        System.out.println("the value of the maximum element in this array is: "+ min);


    }

}
