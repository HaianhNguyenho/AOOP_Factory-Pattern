package factorypattern.demo2;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza cratePizza(String donHang) {
        if(donHang.equals("cheese")){
            return new NYStyleChessePizza();
        }else if(donHang.equals("veggie")){
            return new NYStyleVeggiePizza();
        }else if(donHang.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        }else if(donHang.equals("clam")){
            return new NYStyleClamPizza();
        }
        return null;
    }
    
}
