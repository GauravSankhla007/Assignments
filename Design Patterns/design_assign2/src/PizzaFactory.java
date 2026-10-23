public class PizzaFactory {

    Pizza createPizza(String type){

        if(type.equals("cheese")){
            return new CheesePizza();
        }else if(type.equals("veggie")){
            return new VeggiePizza();
        } else if (type.equals("pepperoni")) {
            return new PepperoniPizza();
        }
        else {
            return null;
        }
    }

}
