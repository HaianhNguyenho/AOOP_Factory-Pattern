package factorypattern.demo5;

public class Vanila implements Icecream{

    @Override
    public String getType() {
        System.out.println("vani");
        return "vani";
    }

    @Override
    public int getAmount() {
        System.out.println("4");
        return 4;
    }

    @Override
    public double getMoney() {
        System.out.println(40.000);
        return 40.000;
    }
    
}
