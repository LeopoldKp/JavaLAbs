public class Proxy implements DBR {

    private DBR repository;

    public Proxy(DBR repository) {
        this.repository = repository;
    }

    @Override
    public void read() {
        repository.beginTransaction();
        repository.read();
        repository.endTransaction();
    }

    @Override
    public void beginTransaction() {
        repository.beginTransaction();
    }

    @Override
    public void endTransaction() {
        repository.endTransaction();
    }
}