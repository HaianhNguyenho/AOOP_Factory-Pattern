package factorypattern.demo5;

public class Cilent1 {
    public static void main(String[] args) {
        
        System.out.println("========kem dau=======");
        Icecream kemFactory = KemFactory.viewKem("kemdau");
        kemFactory.getType();
        kemFactory.getAmount();
        kemFactory.getMoney();
        System.out.println("========kem socola======");
        Icecream kemIcecream = KemFactory.viewKem("kemsocola");
        kemIcecream.getType();
        kemIcecream.getAmount();
        kemIcecream.getMoney();
        System.out.println("===========kem vani=======");
        Icecream kemIcecream2 = KemFactory.viewKem("kemvani");
        kemIcecream2.getType();
        kemIcecream2.getAmount();
        kemIcecream2.getMoney();
       
    }
    
}
