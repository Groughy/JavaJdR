package items.equipments.weapons;

import heroes.Persona;
import items.equipments.Equipment;

public abstract class Weapon extends Equipment {
    public Weapon(String name, int value, String description, Persona character) {
        super(name, value, description);
        character.setDamage(character.getStrengthPoints()+ value);
    }
}
