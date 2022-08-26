package factorypattern.demo4;

public class Shopowner1 {

    public static void main(String[] args) {
        MobilePhoneFactory mobilePhoneFactory = new MobilePhoneFactory();
        
        mobilePhoneFactory.viewMobilePhone("Oppo");
        mobilePhoneFactory.viewMobilePhone("Samsung");
        mobilePhoneFactory.viewMobilePhone("Realme");
    }
    
       
    
    
}
