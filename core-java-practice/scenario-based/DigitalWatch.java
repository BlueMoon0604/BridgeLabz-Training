public class DigitalWatch {
    public static void main(String[] args) {
        for (int hour = 0; hour < 24; hour++) {
            for (int mins = 0; mins < 60; mins++) {
                System.out.printf("%02d:%02d\n", hour, mins);
                if (hour == 13 && mins == 0) {
                    System.out.println("Power cut! Watch stopped");
                    return; 
                }
            }
        }
    }
}
