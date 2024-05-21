package spells;

public abstract class Spell {
    protected String name;
    protected String description;

    public Spell(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
