import java.util.Scanner;

public class AnalyzeTemperature {
    public static void analyze(float[][] temps) {
        int hottest = 0;
        int coldest = 0;
        float maxTemperature = temps[0][0];
        float minTemperature = temps[0][0];
        for (int day = 0; day < 7; day++) {
            float dayMax = 0;
            for (float hour : temps[day]) {
                if (hour > maxTemperature) {
                    maxTemperature = hour;
                    hottest = day;
                }
                if (hour < minTemperature) {
                    minTemperature = hour;
                    coldest = day;
                }
                if (hour > dayMax) {
                	dayMax = hour;
                }
            }
        }
        System.out.println("Hottest day: " + (hottest + 1) + " (temp: " + maxTemperature + ")");
        System.out.println("Coldest day: " + (coldest + 1) + " (temp: " + minTemperature + ")");
        
        for (int day = 0; day < 7; day++) {
            float avg = 0;
            for (float t : temps[day]) {
                avg += t;
            }
            avg /= 24;
            System.out.printf("%.1f ", avg);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[][] dailyTemp = new float[7][24];
        System.out.println("Enter temperatures (7 days x 24 hours):");
        for (int d = 0; d < 7; d++) {
            for (int h = 0; h < 24; h++) {
                dailyTemp[d][h] = sc.nextFloat();
            }
        }
        analyze(dailyTemp);
        sc.close();
    }
}
