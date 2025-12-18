public class VolumeEarth {
    public static void main(String[] args) {
        double radius = 6378;
        double vol = (4/3) *Math.PI * Math.pow(radius, 3);
        double VolMiles = vol * 1.6 ;
        System.out.println("The volume of earth in cubic kilometers is " + vol +" and cubic miles is " + VolMiles);
    }
    
}
