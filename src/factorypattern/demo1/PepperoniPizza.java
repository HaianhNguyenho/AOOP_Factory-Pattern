package factorypattern.demo1;

public class PepperoniPizza extends Pizza {
    
    public PepperoniPizza(){
        name = "Pepperoni Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";

        toppings.add("Sliced Pepperoni");
        toppings.add("SLiced Onion");
        toppings.add("Grated parmesan cheese");
    }
}
