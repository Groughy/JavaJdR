package items.equipments.weapons;

import heroes.Persona;

public class Staff extends Weapon
{
    public Staff(Persona character){
        super("Bâton", 5, "Un long bâton en bois, avec des runes inscrites dessus. Signe des mages.", character);
        character.setMagicPoints(character.getMagicPoints() + 15);
    }
}
