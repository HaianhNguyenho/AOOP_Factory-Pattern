package factorypattern.demo4;

public class MobilePhoneFactory {
   
    public void viewMobilePhone(String type){
        MobiePhone mobiePhone = null;
        if(type.equals("Oppo")){
            mobiePhone = new Oppo();
            mobiePhone.view();
        }else if(type.equals("Samsung")){
            mobiePhone = new SamSung();
            mobiePhone.view();
        }else if(type.equals("Realme")){
            mobiePhone = new Realme();
            mobiePhone.view();
        }
        
    }
    

    
}
