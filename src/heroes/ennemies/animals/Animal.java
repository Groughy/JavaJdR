package heroes.ennemies.animals;

import heroes.ennemies.Enemy;

public abstract class Animal extends Enemy {
    public Animal(String name, int health, int strength, int defense, int agility, int magic) {
        super(name, health, strength, defense, agility, magic);
    }
}
