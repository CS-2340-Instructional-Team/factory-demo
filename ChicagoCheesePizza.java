class ChicagoCheesePizza extends Pizza {
    ChicagoCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }
    
    // Override the cut method
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}