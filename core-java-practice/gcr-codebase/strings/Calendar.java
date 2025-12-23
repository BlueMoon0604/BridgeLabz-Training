import java.util.Scanner;

public class Calendar {
    static String[] months = {"January", "February", "March", "April", "May", "June",
                              "July", "August", "September", "October", "November", "December"};
    
    static int[] daysInMonth = {31, 28, 31, 30, 31, 30,
                                31, 31, 30, 31, 30, 31};

    // Check leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public static int getDaysInMonth(int month, int year) {
        if (month == 1) { // February
            return isLeapYear(year) ? 29 : 28;
        }
        return daysInMonth[month];
    }

    // Get name of the month
    public static String getMonthName(int month) {
        return months[month];
    }

    // Calculate the day of week for the first day of the month
    // 0=Sunday, 1=Monday,... 6=Saturday
    public static int getFirstDayOfMonth(int year, int month) {
        int d = 1; // First day of the month
        int y0 = year - (14 - (month + 1)) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = (month + 1) + 12 * ((14 - (month + 1)) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }

    public static void displayCalendar(int month, int year) {
        int days = getDaysInMonth(month, year);
        int startDay = getFirstDayOfMonth(year, month);

        System.out.println("     " + getMonthName(month) + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        // Print indentation for first day
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= days; day++) {
            System.out.printf("%4d", day);
            startDay++;
            if (startDay == 7) {
                startDay = 0;
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int monthInput = sc.nextInt() - 1;
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (monthInput < 0 || monthInput > 11) {
            System.out.println("Invalid month entered!");
        } else {
            displayCalendar(monthInput, year);
        }
        sc.close();
    }
}
