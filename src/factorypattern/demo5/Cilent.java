package factorypattern.demo5;

public class Cilent {
    public static void main(String[] args) {

        Strawberry kem = new Strawberry();
        System.out.println("=======Kem Dau ==========");
        System.out.println("Loai kem: "+kem.getType());
        System.out.println("So luong: "+kem.getAmount());
        System.out.println("Tien: "+kem.getMoney());

        Chocolate chocolate = new Chocolate();
        System.out.println("======Kem Socola =====");
        System.out.println("Loai kem: "+chocolate.getType());
        System.out.println("So luong: "+chocolate.getAmount());
        System.out.println("Tien: "+chocolate.getMoney());

        Vanila kemVani = new Vanila();
        System.out.println("========Kem Vani=======");
        System.out.println("Loai kem: "+kemVani.getType());
        System.out.println("So luong: "+kemVani.getAmount());
        System.out.println("Tien: "+kemVani.getMoney());

    }
}
