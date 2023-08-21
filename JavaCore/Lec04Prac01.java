package JavaCore;

import java.util.Scanner;

/**
 * Lec04Prac01
 */
public class Lec04Prac01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Month: ");

        int month = scanner.nextInt();
        System.out.println("Year: ");

        int year = scanner.nextInt();

        int dayInMonth = 0;

        switch (month) {

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dayInMonth = 31;
                break;

            case 4: case 6: case 9: case 11:
                dayInMonth = 30;
                break;

            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    dayInMonth = 29;
                } else {
                    dayInMonth = 28;
                }
                break;
                
            default:
                System.out.println("Invalid Month");
        }
        if (dayInMonth > 0) {
            System.out.println("Day in month " + month + "/" + year + " is " + dayInMonth);
        }
    }
}