package factorypattern.demo2;

public class NYStylePepperoniPizza extends Pizza {
    
    public NYStylePepperoniPizza(){
        name = "NY Style Pepperoni Pizza";

        dough = "THin Crust Dough";

        sauce = "Marinara Souce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Sliced Pepperoni");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushroom");
        toppings.add("Red Pepper");
    }
}
