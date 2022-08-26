package factorypattern.demo5;

public class Chocolate implements Icecream {

    @Override
    public String getType() {
       
        System.out.println("kem socola");
        return "socola";
    }

    @Override
    public int getAmount() {
        System.out.println("3");
        return 3;
    }

    @Override
    public double getMoney() {
      System.out.println(30.000);
        return 30.000;
    }
    
}
