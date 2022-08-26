package factorypattern.demo2;

public class NYStyleChessePizza extends Pizza {
    
    public NYStyleChessePizza(){
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Mainara Sauce";

        toppings.add("Grated Reggiano Chesse");
    }
}
