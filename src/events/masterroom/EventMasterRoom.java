package events.masterroom;

import events.Event;
import heroes.Persona;
import heroes.actions.ChooseMenu;

public class EventMasterRoom extends Event implements ChooseMenu {
    public EventMasterRoom(Persona character) {
        super("Vous sentez que vous arrivez à la fin de votre quête. Dès que vous avez quitté la pièce immense, vous avez l'impression que toutes les proportions sont revenues à la normale. Vous voyez une montagne de d'or, gardée par une femme en armure de cuir, avec deux dagues à sa ceinture. Elle ne semble pas vouloir vous attaquer pour l'instant. Vous pouvez : \n1. L'attaquer \n2. Lui parler.");
        chooseMenu(character);
    }

    @Override
    public void chooseMenu(Persona character) {
switch (getAnswer.nextInt()) {
            case 1:
                System.out.println("Vous décidez d'affronter la femme.");
                new EventFightMaster(character);
                break;
            case 2:
                new EventTalkMaster(character);
                break;
            default:
                System.out.println("Je n'ai pas compris votre choix.");
                chooseMenu(character);
                break;
        }
    }
}
