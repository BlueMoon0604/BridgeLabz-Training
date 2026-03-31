import java.util.Arrays;
import java.util.List;

public class StockPriceLogger {
	public static void main(String[] args) {
		List<Double> prices = Arrays.asList(2000.0, 300.0, 3500.0, 4500.0);
		prices.forEach(price -> System.out.println(price));
	}

}
