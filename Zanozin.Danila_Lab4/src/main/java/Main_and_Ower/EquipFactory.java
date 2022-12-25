package Main_and_Ower;

import Coffee.CM;
import Coffee.Turca;
import Interface.Equip;
import Tea.Samovar;
import Tea.TeaMake;

public class EquipFactory {
    public static Equip factory(String type) {
        return switch (type) {
            case "Tea machine" -> new TeaMake();
            case "Samovar" -> new Samovar();
            case "Coffee machine" -> new CM();
            case "Turca" -> new Turca();
            default -> throw new RuntimeException("Not found equipment");
        };
    }
}