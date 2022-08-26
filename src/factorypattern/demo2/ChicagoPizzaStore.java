package factorypattern.demo2;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    protected Pizza cratePizza(String donHang) {
        if(donHang.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else if(donHang.equals("veggie")){
            return new ChicagoStyleVeggiePizza();
        }else if(donHang.equals("clam")){
            return new ChicagoStyleClamPizza();
        }else if(donHang.equals("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        }
        return null;
    }

    
    
}
