package characters.ennemies.animals;

import characters.ennemies.Enemy;

public abstract class Animal extends Enemy {
    public Animal(String name, int health, int strength, int defense, int agility, int magic) {
        super(name, health, strength, defense, agility, magic);
    }
}
