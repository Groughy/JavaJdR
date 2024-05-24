package events.giantroom;

import events.Event;
import events.smallroom.EventSmallDoor;
import heroes.Persona;
import heroes.actions.ChooseMenu;

public class EventGiantDoor extends Event implements ChooseMenu {
    public EventGiantDoor(Persona character) {
        super("Une porte gigantesque se présente devant vous. Elle doit facilement faire entre deux et trois fois votre taille. Pourtant la pognée et à votre hauteur. Allez vous ? \n1. Ouvrir la porte ? \n2. Regarder l'autre porte ?");
        chooseMenu(character);
    }

    @Override
    public void chooseMenu(Persona character) {
        switch (getAnswer.nextInt()) {
            case 1:
                System.out.println("Vous poussez la porte. Elle s'ouvre sans difficulté. Vous entrez dans une salle immense.");
                new EventGiantRoom(character);
                break;
            case 2:
                new EventSmallDoor(character);
                break;
            default:
                System.out.println("Choix invalide.");
                break;
        }
    }
}
