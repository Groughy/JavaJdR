package items.equipments.armors.helmets;

import heroes.Persona;

public class FlatHelmet extends Helmet{
    public FlatHelmet(Persona character){
        super("Casque en plaque", 15, "Un casque en plaque lourde, protégeant l'entièreté de la tête.", character);
        character.setAgilityPoints(character.getAgilityPoints() - 5);
    }
}
