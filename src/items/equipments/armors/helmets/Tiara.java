package items.equipments.armors.helmets;

import characters.Persona;

public class Tiara extends Helmet{
    public Tiara(String name, int value, String description) {
        super(name, value, description);
    }
    public Tiara(Persona character){
        super("Tiara", 0,"Une tiare de mage en argent, ornée d'une petite saphir bleue, signe distinctif des mages.");
        character.setMagicPoints(character.getMagicPoints() + 15);
    }
}
