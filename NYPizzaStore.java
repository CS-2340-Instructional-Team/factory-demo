public class NYPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("pepperoni")) {
			return new NYPepperoniPizza();
		} else return null;
	}
}
// Note: Registration and Reflection can be used to deal with the issue of
// multiple types of NYStylePizzas that could be added later. In that scenario, the PizzaStore class
// is violating OCP. A registration and reflection mechanism is demoed below
// In this modified version, the createPizza method isn't abstract in the Java sense (because it has an implementation),
// but it still fulfills the role of the "abstract" method in the conceptual pattern.
// This is because it's meant to be overridden by the subclasses if needed, especially if a different instantiation strategy is desired.

//import java.util.HashMap;
//		import java.util.Map;
//		import java.lang.reflect.Constructor;
//
//public abstract class PizzaStore {
//	private Map<String, Class<? extends Pizza>> registeredPizzas = new HashMap<>();
//
//	public Pizza orderPizza(String type) {
//		Pizza pizza = createPizza(type);
//
//		if (pizza != null) {
//			pizza.prepare();
//			pizza.bake();
//			pizza.cut();
//			pizza.box();
//		}
//		return pizza;
//	}
//
//	// This is still conceptually an abstract method in terms of the Factory Method pattern,
//	// but now it's implemented using reflection based on registered pizzas.
//	protected Pizza createPizza(String type) {
//		Class<? extends Pizza> pizzaClass = registeredPizzas.get(type);
//		if (pizzaClass != null) {
//			try {
//				Constructor<? extends Pizza> constructor = pizzaClass.getConstructor();
//				return constructor.newInstance();
//			} catch (Exception e) {
//				// Handle the exception as appropriate in your context
//				e.printStackTrace();
//			}
//		}
//		return null;
//	}
//
//	// This method is used for registering pizza types to the store.
//	protected void registerPizza(String type, Class<? extends Pizza> pizzaClass) {
//		registeredPizzas.put(type, pizzaClass);
//	}
//}
//
//public class NYPizzaStore extends PizzaStore {
//	public NYPizzaStore() {
//		registerPizza("cheese", NYStyleCheesePizza.class);
//		registerPizza("pepperoni", NYPepperoniPizza.class);
//		// Register other NY pizzas here
//	}
//}
//
//public class ChicagoPizzaStore extends PizzaStore {
//	public ChicagoPizzaStore() {
//		registerPizza("cheese", ChicagoCheesePizza.class);
//		registerPizza("pepperoni", ChicagoPepperoniPizza.class);
//		// Register other Chicago pizzas here
//	}
//}
