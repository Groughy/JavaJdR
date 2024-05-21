package items.equipments.armors.busts;

import heroes.Persona;
import items.equipments.armors.Armor;

public abstract class Bust extends Armor {
    public Bust(String name, int value, String description, Persona character) {
        super(name, value, description, character);
    }
}
