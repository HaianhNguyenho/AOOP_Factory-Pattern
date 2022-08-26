package factorypattern.demo2;

public abstract class PizzaStore {
    
  

    public Pizza orderPizza(String loai){
        Pizza pizza;

        pizza = cratePizza(loai);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

  protected  abstract Pizza cratePizza(String donHang);
}
