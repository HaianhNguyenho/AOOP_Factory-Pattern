package factorypattern.demo2;

public class NYStyleVeggiePizza extends Pizza{

    public NYStyleVeggiePizza(){
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinare Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushroom");
        toppings.add("Red Pepper");
    }
    
}
