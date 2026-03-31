package shopping_cart;

public class Main{
    public static void main(String[] args) {

        ShoppingCartManager cart = new ShoppingCartManager();

        cart.addProduct("Laptop", 125000);
        cart.addProduct("Mouse", 1700);
        cart.addProduct("Tablet", 79000);
        cart.addProduct("Mobile Phone", 200000);

        cart.displayCartOrder();
        cart.displaySortedByPrice();
    }
}
