package factorypattern.demo3;

public abstract class PizzaStore {
    
    protected abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        System.out.println("---Making a "+pizza.getName()+ "---");
        pizza.prepare();
        pizza.cut();
        pizza.bake();
        pizza.box();
        return pizza;
    }
}
