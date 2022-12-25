public class Type_of_truck_2 extends AbstractTrack {
    public Type_of_truck_2(String name, String engine_type, String body_type) {
        super(name);
        this.engine_type = engine_type;
        this.body_type = body_type;
    }

    public String GetTruckType() {
        return "2-осевой";
    }

    public String GetEngineType() {
        return this.engine_type;
    }

    public String GetBodyType() {
        return this.body_type;
    }
}
