package items.equipments;

import characters.Persona;
import items.Item;

public abstract class Equipment extends Item {
    public Equipment(String name, int value, String description) {
        super(name, value, description);
    }
    public Equipment(Persona character){
        super();
    }
}
