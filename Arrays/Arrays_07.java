// Classroom of 50 students
// store marks of these students
// two methods => create variable or array
// obviously array is the best option

package Arrays;

public class Arrays_07 {
    public static void main(String[] args) {

        // 3 ways to create array in java
        // 1) Declaration and memory allocation
        int [] StudentData = new int[3];
        StudentData [0] = 90;
        StudentData [1] = 80;
        StudentData [2] = 70;
        System.out.println(StudentData[1]);

        // 2) Declaration and then memory allocation
        int [] marks;
        marks = new int[6];
        marks [0] = 90;
        marks [1] = 80;
        marks [2] = 75;
        marks [3] = 100;
        marks [4] = 56;
        marks [5] = 88;
        System.out.println(marks[4]);

        // 3) Declaration, memory allocation and initialization together
        int [] ClassMarksArray = {90, 80, 75, 100, 56, 88};
        System.out.println(marks[2]);
    }
}
