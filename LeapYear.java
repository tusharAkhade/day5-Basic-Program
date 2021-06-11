/**
 * Logic for Leap year:
 * year is divisible by 4 but not divisible by 100 and
 * year is divisible by 400
 */
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int  year = sc.nextInt();

        if ( (year%4 == 0 && year%100 != 0) || year%400 == 0 ) {
            System.out.println(year + " is Leap year.");
        } else {
            System.out.println(year + " is not a Leap year.");
        }

    }
}