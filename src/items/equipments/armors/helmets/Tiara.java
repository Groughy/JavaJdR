package items.equipments.armors.helmets;

import characters.Persona;

public class Tiara extends Helmet{
    public Tiara(Persona character){
        super("Tiara", 0,"Une tiare de mage en argent, ornée d'une petite saphir bleue, signe distinctif des mages.", character);
        character.setMagicPoints(character.getMagicPoints() + 15);
    }
}
