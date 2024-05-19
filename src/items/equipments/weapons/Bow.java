package items.equipments.weapons;

import characters.Persona;

public class Bow extends Weapon{
    public Bow(Persona character) {
        super("Arc", 15, "Une arme à distance, permettant de tirer des flèches sur les ennemis", character);
    }
}
