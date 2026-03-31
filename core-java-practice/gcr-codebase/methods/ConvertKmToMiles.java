public class ConvertKmToMiles {
	public static void main(String[] args) {

        System.out.println(convertKmToMiles(10));

        System.out.println(convertMilesToKm(5));

        System.out.println(convertMetersToFeet(3));

        System.out.println( convertFeetToMeters(20));
    }
	public static double convertKmToMiles(double km) {
        double num = 0.621371;
        return km * num;
    }

    
    public static double convertMilesToKm(double miles) {
        double num = 1.60934;
        return miles * num;
    }

    
    public static double convertMetersToFeet(double meters) {
        double num = 3.28084;
        return meters * num;
    }

    
    public static double convertFeetToMeters(double feet) {
        double num= 0.3048;
        return feet * num;
    }
	
}