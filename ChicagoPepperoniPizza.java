class ChicagoPepperoniPizza extends Pizza {
    ChicagoPepperoniPizza() {
        name = "Chicago Style Deep Dish Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Pepperoni");
    }
    
    // Override the cut method
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
