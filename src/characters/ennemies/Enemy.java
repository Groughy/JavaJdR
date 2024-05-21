package characters.ennemies;

import characters.Persona;

public abstract class Enemy {
    protected String name;
    protected int health;
    protected int strength;
    protected int defense;
    protected int agility;
    protected int magic;

    public Enemy(String name, int health, int strength, int defense, int agility, int magic) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
        this.agility = agility;
        this.magic = magic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void attack(Persona character) {

    }
}
