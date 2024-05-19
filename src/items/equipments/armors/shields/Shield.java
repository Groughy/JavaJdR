package items.equipments.armors.shields;

import characters.Persona;
import items.equipments.armors.Armor;

public abstract class Shield extends Armor {
    public Shield(String name, int value, String description, Persona character) {
        super(name, value, description, character);
    }
}
