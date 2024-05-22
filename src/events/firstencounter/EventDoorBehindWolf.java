package events.firstencounter;

import events.Event;
import events.EventPath;
import heroes.Persona;

public class EventDoorBehindWolf extends Event {
    public EventDoorBehindWolf(Persona character) {
        super("Vous vous approchez de la porte et allez pour l'ouvrir.");
        if (character.isSkinnedWolf()){
            System.out.print("Vous ressentez une douleur indescriptible au bras qui tient la poignée de la porte. Ce même bras semble perdre sa peau, laissant le muscle apparent et dégoulinant de sang.");
            character.setLifePoints(character.getLifePoints() - 5);
            character.setDefaultStrengthPoints(character.getStrengthPoints() - 5);
            new EventPath(character);
            if(character.getLifePoints() <= 0){
                System.out.print("Vous vous effondrez au sol, mort.");
                startAgain();
            }
        }
        if (character.isKilledWolf()){
            System.out.print("Dès que vous touchez la poignée de la porte, une douleur vous foudroie, tel un pieu dans le coeur.");
            character.setLifePoints(character.getLifePoints() - 2);
            new EventPath(character);
            if(character.getLifePoints() <= 0){
                System.out.print("Vous vous effondrez au sol, mort.");
                startAgain();
            }
        }
    }
}
