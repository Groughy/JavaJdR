package items.equipments.armors;

import characters.Persona;
import items.equipments.Equipment;

public abstract class Armor extends Equipment {
    public Armor(String name, int value, String description, Persona character) {
        super(name, value, description);
    }
}
