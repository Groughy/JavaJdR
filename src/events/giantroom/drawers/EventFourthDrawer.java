package events.giantroom.drawers;

import events.Event;
import events.giantroom.EventSearchDresser;
import heroes.Persona;
import heroes.actions.ChooseMenu;

public class EventFourthDrawer extends Event implements ChooseMenu {
    public EventFourthDrawer(Persona character) {
        super("Vous prenez la potion de soin, est-ce que vous la buvez ? \n1. Oui. \n2. Non.");
        chooseMenu(character);
    }

    @Override
    public void chooseMenu(Persona character) {
switch (getAnswer.nextInt()) {
            case 1:
                System.out.println("Vous buvez la potion de soin et récupérez 10 points de vie.");
                if(character.getLifePoints() + 10 > character.getDefaultLifePoints()){
                    character.setLifePoints(character.getDefaultLifePoints());
                    break;
                }
                character.setLifePoints(character.getLifePoints() + 10);
                break;
            case 2:
                System.out.println("Vous ne buvez pas la potion de soin et la laissez ici.");
                break;
            default:
                System.out.println("Je n'ai pas compris votre choix.");
                chooseMenu(character);
                break;
        }
        new EventSearchDresser(character);
    }
}
