package m1Questions;

import java.util.Scanner;

public class ShipmentRecord {

    public static boolean isValidRecord(String record) {
        String[] parts = record.split("\\|");
        if (parts.length != 5) {
            return false;
        }

        String shipmentcode = parts[0];
        String shipmentdate = parts[1];
        String mode = parts[2];
        String weight = parts[3];
        String status = parts[4];

        return isValidShipmentCode(shipmentcode)
                && isValidShipmentDate(shipmentdate)
                && isValidMode(mode)
                && isValidWeight(weight)
                && isValidStatus(status);
    }

    public static boolean isValidShipmentCode(String shipmentcode) {
        if (!shipmentcode.startsWith("SHIP-")) {
            return false;
        }

        String digits = shipmentcode.substring(5);

        if (!digits.matches("[1-9][0-9]{5}")) {
            return false;
        }

        int count = 1;
        for (int i = 1; i < digits.length(); i++) {
            if (digits.charAt(i) == digits.charAt(i - 1)) {
                count++;
                if (count > 3) {
                    return false;
                }
            } else {
                count = 1;
            }
        }
        return true;
    }

    public static boolean isValidShipmentDate(String shipmentdate) {
        if (!shipmentdate.matches("20\\d{2}-\\d{2}-\\d{2}")) {
            return false;
        }

        String[] dateparts = shipmentdate.split("-");
        int year = Integer.parseInt(dateparts[0]);
        int month = Integer.parseInt(dateparts[1]);
        int day = Integer.parseInt(dateparts[2]);

        if (month < 1 || month > 12) {
            return false;
        }

        int[] daysinmonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            daysinmonth[1] = 29;
        }

        if (day < 1 || day > daysinmonth[month - 1]) {
            return false;
        }

        return true;
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static boolean isValidMode(String mode) {
        return "AIR".equals(mode)
                || "SEA".equals(mode)
                || "ROAD".equals(mode)
                || "RAIL".equals(mode)
                || "EXPRESS".equals(mode)
                || "FREIGHT".equals(mode);
    }

    public static boolean isValidWeight(String weight) {
        if (!weight.matches("(0|[1-9]\\d{0,5})(\\.\\d{1,2})?")) {
            return false;
        }

        float value = Float.parseFloat(weight);
        return value > 0 && value <= 999999.99f;
    }

    public static boolean isValidStatus(String status) {
        return "DELIVERED".equals(status)
                || "CANCELLED".equals(status)
                || "IN_TRANSIT".equals(status);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of records");
        int N = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < N; i++) {
            String record = sc.nextLine().trim();
            if (isValidRecord(record)) {
                System.out.println("COMPLIANT RECORD");
            } else {
                System.out.println("NON-COMPLIANT RECORD");
            }
        }
        sc.close();
    }
}