public class NYPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("pepperoni")) {
			return new NYPepperoniPizza();
		} else return null;
	}
}
