package items.equipments.armors.helmets;

import characters.Persona;
import items.equipments.armors.Armor;

public abstract class Helmet extends Armor {
    public Helmet(String name, int value, String description, Persona character) {
        super(name, value, description, character);
        character.setDefensePoints(character.getDefensePoints() + value);
    }
}
