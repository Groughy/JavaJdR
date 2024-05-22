package events.firstencounter;

import events.Event;
import heroes.Persona;
import heroes.actions.ChooseMenu;

public class EventTakeCollar extends Event implements ChooseMenu {
    public EventTakeCollar(Persona character) {
        super("Vous avez pris le collier. Vous pouvez maintenant sortir de la pièce. \n1. Voulez-vous l'inspecter ?\n2. Voulez-vous intéragir avec le loup ? \n3. Voulez-vous partir ?");
        character.setTookCollarWolf(true);
        chooseMenu(character);
    }

    @Override
    public void chooseMenu(Persona character) {
        switch (getAnswer.nextInt()) {
            case 1:
                System.out.println("Vous inspectez le collier. Il est fait de chaines de mailles et la qualité prouve qu'il n'est là que pour faire tenir le pendentif.");
                break;
            case 2:
                System.out.println("Vous vous approchez du loup. Il est mort. Vous ne pouvez rien faire de plus.");
                break;
            case 3:
                System.out.println("Vous sortez de la pièce.");
                break;
            default:
                System.out.println("Choix invalide.");
                break;
        }
    }
}
