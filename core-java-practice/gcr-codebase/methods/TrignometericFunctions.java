public class TrignometericFunctions{
	
    public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        
        return new double[]{sine, cosine, tangent};
    }

    // Example usage
    public static void main(String[] args) {
        TrignometericFunctions calc = new TrignometericFunctions();
        double angle = 45;
        double[] results = calc.calculateTrigonometricFunctions(angle);
        
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
    }
}
