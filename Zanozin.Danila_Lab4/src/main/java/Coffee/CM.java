package Coffee;

import Interface.Equip;
import Interface.Product;

public class CM implements Equip {
    @Override
    public Product make(String name) {
        return new Coffee(name);
    }
}
