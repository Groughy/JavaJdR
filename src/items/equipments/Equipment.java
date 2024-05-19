package items.equipments;

import items.Item;

public abstract class Equipment extends Item {
    public Equipment(String name, int value, String description) {
        super(name, value, description);
    }
    public Equipment(){
        super();
    }
}
