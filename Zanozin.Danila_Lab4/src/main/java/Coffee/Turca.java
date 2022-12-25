package Coffee;

import Interface.Equip;
import Interface.Product;

public class Turca implements Equip {
    @Override
    public Product make(String name) {
        return new Coffee(name);
    }
}