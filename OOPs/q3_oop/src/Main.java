public class Main {
    public static void main(String[] args) {

        Products p1 = new Products("Keyboard",1599,1);
        Products p2 = new Products("Casio GAB 2100",9000,2);
        Products p3 = new Products("Timex Weekender",5000,2);

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);
        cart.removeProduct(p2);
        cart.displayCart();
        System.out.println(cart.calculateTotal());

    }

}