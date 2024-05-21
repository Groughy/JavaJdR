package items.equipments.armors;

import heroes.Persona;
import items.equipments.Equipment;

public abstract class Armor extends Equipment {
    public Armor(String name, int value, String description, Persona character) {
        super(name, value, description);
        character.setDefensePoints(character.getDefensePoints() + value);
    }
}
