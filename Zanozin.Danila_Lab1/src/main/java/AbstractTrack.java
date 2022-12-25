public abstract class AbstractTrack {
    protected String name;
    protected String engine_type;
    protected String body_type;

    public AbstractTrack(String name) {
        this.name = name;
    }

    public String GetName() {
        return this.name;
    }

    public String GetTruckType() {
        return "for manual approval";
    }

    public String GetEngineType() {
        return "for manual approval";
    }

    public String GetBodyType() {
        return "for manual approval";
    }
}