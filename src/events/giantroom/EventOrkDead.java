package events.giantroom;

import events.Event;
import heroes.Persona;
import heroes.actions.ChooseMenu;

public class EventOrkDead extends Event implements ChooseMenu {
    public EventOrkDead(Persona character) {
        super("L'orc gît à vos pieds, vaincu. Vous avez gagné le combat. Vous pouvez : \n1. Fouiller le corps de l'orc. \n2. Regarder autour de vous.");
        character.setKilledOrk(true);
        chooseMenu(character);
    }

    @Override
    public void chooseMenu(Persona character) {
        switch (getAnswer.nextInt()) {
            case 1:
                System.out.println("Vous fouillez le corps de l'orc.");
                new EventLootOrk(character);
                break;
            case 2:
                new EventGiantRoom(character);
                break;
            default:
                System.out.println("Choix invalide.");
                chooseMenu(character);
        }
    }
}

