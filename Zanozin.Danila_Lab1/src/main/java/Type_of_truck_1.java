public class Type_of_truck_1 extends AbstractTrack {
    public Type_of_truck_1(String name, String engine_type, String body_type) {
        super(name);
        this.engine_type = engine_type;
        this.body_type = body_type;
    }

    public String GetTruckType() {
        return "1-осевой";
    }

    public String GetEngineType() {
        return this.engine_type;
    }

    public String GetBodyType() {
        return this.body_type;
    }
}
