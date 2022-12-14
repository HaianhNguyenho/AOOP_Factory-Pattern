package factorypattern.demo2;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();

        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+pizza.getName()+"\n");
        
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel orederd a "+pizza.getName()+ "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a "+pizza.getName()+"\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a "+pizza.getName()+"\n");
        
    }
    
}
