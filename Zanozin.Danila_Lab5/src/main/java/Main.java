public class Main {
    public static void main(String[] args) {
        DBR postgres = new PostgresRepository();
        DBR proxy = new Proxy(postgres);

        proxy.read();
    }
}