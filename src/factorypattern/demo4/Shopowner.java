package factorypattern.demo4;

public class Shopowner {
    

    public void viewOppo(){
        Oppo oppo = new Oppo();
        oppo.view();
    }

    public void viewSamSung(){
        SamSung samSung = new SamSung();
        samSung.view();
    }
    public void viewRealme(){
        Realme realme = new Realme();
        realme.view();
    }
    
}
