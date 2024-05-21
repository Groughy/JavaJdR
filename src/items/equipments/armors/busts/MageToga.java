package items.equipments.armors.busts;

import heroes.Persona;

public class MageToga extends Bust{
    public MageToga(Persona character) {
        super("Toge de mage", 10, "Une longue robe en soie, orne de runes brodées par des fils d'or et d'argent, signe des mages.", character);
        character.setMagicPoints(character.getMagicPoints() + 15);
    }
}
