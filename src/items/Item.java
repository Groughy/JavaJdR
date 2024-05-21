package items;

import characters.Persona;

public abstract class Item {
    protected String name;
    protected int value;
    protected String description;

    public Item(String name, int value, String description) {
        this.name = name;
        this.value = value;
        this.description = description;
    }
    public Item(){
        this.name = "Unknown";
        this.value = 0;
        this.description = "Unknown";
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
