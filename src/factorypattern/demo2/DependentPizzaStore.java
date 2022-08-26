package factorypattern.demo2;

public class DependentPizzaStore {

   public Pizza createPizza(String style, String type){
    Pizza pizza = null;
    if(style.equals("NY")){
    if(style.equals("cheese")){
        pizza = new NYStyleChessePizza();
    }else if(type.equals("veggie")){
        pizza = new NYStyleVeggiePizza();
    }else if(type.equals("clam")){
        pizza = new NYStyleClamPizza();
    }else if(type.equals("pepperoni")){
        pizza = new NYStylePepperoniPizza();
    }
   }else if(style.equals("Chicago")){
    if(type.equals("cheese")){
        pizza = new ChicagoStyleCheesePizza();
    }else if(type.equals("veggie")){
        pizza = new ChicagoStyleVeggiePizza();
    }else if(type.equals("peperoni")){
        pizza = new ChicagoStylePepperoniPizza();
    } 
}else{
    System.out.println("Error: Invail type of pizza");
    return null;
}
    pizza.prepare();
    pizza.bake();
    pizza.box();
    pizza.cut();

    return pizza;
   }
}

