package factorypattern.demo5;

public class KemFactory {

    public static  Icecream viewKem(String key){
        Icecream kem =null ;
        if(key.equals("kemdau")){
           kem  = new Strawberry();
            kem.getType();
            kem.getAmount();
            kem.getMoney();
            
        }else if(key.equals("kemsocola")){
            kem = new Chocolate();
            kem.getType();
            kem.getAmount();
            kem.getMoney();
           

        }else if(key.equals("kemvani")){
            kem = new Vanila();
            kem.getType();
            kem.getAmount();
            kem.getMoney();
           
        }
        return kem;
        
    }
    
}
