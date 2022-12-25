package Main_and_Ower;

public class Main {
    public static void main(String[] args) {
        Welding facade = new Welding();

        System.out.println(facade.weld("Samovar", "Green").getName());
        System.out.println(facade.weld("Coffee machine", "Americano").getName());
    }
}