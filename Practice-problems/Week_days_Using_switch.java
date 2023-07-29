package Practice_Problems;

public class Week_days_Using_switch {
    public static void main(String[] args) {
        int day = 2;
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}
