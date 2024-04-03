
public class ChicagoPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoCheesePizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoPepperoniPizza();
        } else {
            return null;
        }
    }
}
