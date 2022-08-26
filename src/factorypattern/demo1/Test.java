package factorypattern.demo1;

public class Test {
    public static void main(String[] args) {

        SimplePizzaFactory factory = new SimplePizzaFactory();

        SimplePizzaFactory factory1 = new SimplePizzaFactory();

        SimplePizzaFactory factory2 = new SimplePizzaFactory();

        SimplePizzaFactory factory3 = new SimplePizzaFactory();


        PizzaStore store = new PizzaStore(factory);
        PizzaStore store1 = new PizzaStore(factory1);
        PizzaStore store2 = new PizzaStore(factory2);
        PizzaStore store3 = new PizzaStore(factory3);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " +pizza.getName()+ "\n");
        System.out.println(pizza);

        Pizza pizza1 = store1.orderPizza("veggie");
        System.out.println("We ordered a " +pizza1.getName()+ "\n");
        System.out.println(pizza1);
        
        Pizza pizza2 = store2.orderPizza("clam");
        System.out.println("We ordered a " +pizza2.getName()+ "\n");
        System.out.println(pizza2);

        Pizza pizza3 = store3.orderPizza("pepperoni");
        System.out.println("We ordered a " +pizza3.getName()+ "\n");
        System.out.println(pizza3);
    }

   

    
    
}
