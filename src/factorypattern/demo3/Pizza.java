package factorypattern.demo3;

import java.util.Arrays;

public abstract class Pizza {
    
    String name;

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");

    }
    void box(){
        System.out.println("Place pizza in offical PizzaStore box");
    }

    String getName(){
        return name;
    }

    void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza [cheese=" + cheese + ", clams=" + clams + ", dough=" + dough + ", name=" + name + ", pepperoni="
                + pepperoni + ", source=" + sauce + ", veggies=" + Arrays.toString(veggies) + "]";
    }

    
}
