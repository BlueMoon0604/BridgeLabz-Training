import java.util.Arrays;
import java.util.List;

public class IOTSensorReading {
	public static void main(String[] args) {
		List<Double> readings = Arrays.asList(32.5, 67.8, 90.2, 67.1);
		double threshold = 35.0;
		readings.stream().filter(r -> r > threshold).forEach(r -> System.out.println(r));
	}

}
