package factorypattern.demo3;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan odered a" +pizza + "\n");

         pizza = nyStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan orded a " + pizza + "\n" );

        pizza = nyStore.orderPizza("clam");
        System.out.println("Joel orderd a " + pizza + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan order a" + pizza + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza + "\n");
    }
    
}
