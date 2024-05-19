package items.equipments.armors;

import items.equipments.Equipment;

public abstract class Armor extends Equipment {
    public Armor(String name, int value, String description) {
        super(name, value, description);
    }

    public Armor() {
        super();
    }
}
