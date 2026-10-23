public class Main {
    public static void main(String[] args) {

        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.createPizza("cheese");
        pizza.prepare();
        Pizza pizza2 = pizzaFactory.createPizza("veggie");
        pizza2.prepare();
        Pizza pizza3 = pizzaFactory.createPizza("pepperoni");
        pizza3.prepare();



    }
}