import java.util.ArrayList;
import java.util.List;


public class CustomSorting {
	static class Product{
		String name;
		double price;
		double rating;
		double discount;
		
		Product(String name, double price, double rating, double discount){
			this.name = name;
			this.price = price;
			this.rating = rating;
			this.discount = discount;
		}
		public String toString() {
			return name + " ,price : " + price + " ,rating : " + rating + ", discount" + discount;
		}
	}
	public static void main(String[] args) {
		List<Product> p1 = new ArrayList<>();
		p1.add(new Product("Mobile", 89000, 4.8, 10));
		p1.add(new Product("TV", 120000, 4.3, 40));
		p1.add(new Product("Oven", 58000, 3.9, 5));
		
		p1.sort((a,b) -> Double.compare(a.price,b.price));
		System.out.println("Sorted based on price");
		p1.forEach(p -> System.out.println(p.name));
		
		p1.sort((a, b) -> Double.compare(b.rating, a.rating));
        System.out.println("Sorted based on rating");
        p1.forEach(p -> System.out.println(p.name));

        p1.sort((a, b) -> Double.compare(b.discount, a.discount));
        System.out.println("Sorted based on discount");
        p1.forEach(p -> System.out.println(p.name));
	}

}
