package events.smallroom;

import events.Event;
import events.giantroom.EventGiantDoor;
import heroes.Persona;
import heroes.actions.ChooseMenu;

public class EventSmallDoor extends Event implements ChooseMenu {
    public EventSmallDoor(Persona character) {
        super("Cette porte semble trop petite, même si vous essayez de vous accroupir. Cependant, un message est gravé au dessus de celle-ci. \"Tout n'est qu'une question de perspective !\" Vous pouvez \n1. Essayer d'ouvrir la porte \n2. Regarder l'autre porte.");
        chooseMenu(character);
    }

    @Override
    public void chooseMenu(Persona character) {
        switch (getAnswer.nextInt()) {
            case 1:
                if (character.isHasLittleKey()) {
                    System.out.println("Vous essayez d'ouvrir la porte avec la minuscule clé et cela fonctionne. Mais elle reste suffisamment petite pour que vous ayez du mal à passer.");
                new EventSmallRoom(character);
                }
                System.out.println("La porte ne semble pas s'ouvrir, peu importe la force ou la ruse que vous utilisez. Vous décidez de regarder l'autre porte.");
                new EventGiantDoor(character);
                break;
            case 2:
                new EventGiantDoor(character);
                break;
            default:
                System.out.println("Choix invalide.");
                break;
        }
    }
}
