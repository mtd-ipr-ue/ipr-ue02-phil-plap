import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {
        System.out.println("Please chose a number equal to a month between 1 and 12");
        int month = In.readInt();

        System.out.println("Please chose a year");
        int year = In.readInt();
        
        int days = 0;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;
            case 2:
                if (year % 4 == 0 && year%400==0){
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                Out.println("Error");
            }

        System.out.println("In that month there are: " + days + " days");
    }
}

