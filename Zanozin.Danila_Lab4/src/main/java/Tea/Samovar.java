package Tea;

import Interface.Equip;
import Interface.Product;

public class Samovar implements Equip {
    @Override
    public Product make(String name) {
        return new Tea(name);
    }
}
