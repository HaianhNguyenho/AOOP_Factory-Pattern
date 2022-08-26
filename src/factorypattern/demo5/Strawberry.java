package factorypattern.demo5;

public class Strawberry implements Icecream {

    @Override
    public String getType() {
        
        System.out.println("Loai: kem dau");
        return "kem dau";
    }

    @Override
    public int getAmount() {
        System.out.println(2);
       
        return 2;
    }

    @Override
    public double getMoney() {
        System.out.println(20.000);
        return 20.000;
    }
    
    
}
