package events;

import events.masterroom.EventFightMaster;
import heroes.Persona;
import heroes.actions.ChooseMenu;

public class FinalChoiceWoman extends Event implements ChooseMenu {
    public FinalChoiceWoman(Persona character) {
        super("Vous pouvez : \n1. Lui demander l'objet et partir \n2. Lui demander l'objet et l'attaquer \n3. L'attaquer");
        chooseMenu(character);
    }

    @Override
    public void chooseMenu(Persona character) {
switch (getAnswer.nextInt()) {
            case 1:
                System.out.println("Vous lui demandez l'objet recherché en affirmant que vous n'êtes pas là pour autre chose. Elle vous le lance et vous partez, comme promis Vous rendez l'objet au noble qui vous paye généreusement, pensant que vous alliez mourir durant la quête. \nVous avez obtenu la fin \"Honnête\".");
                System.exit(0);
            case 2:
                System.out.println("Vous lui demandez l'objet recherché et pendant qu'elle a le dos tourné, vous l'attaquez.");
                new EventFightMaster(character);
                break;
            case 3:
                new EventFightMaster(character);
                break;
            default:
                System.out.println("Je n'ai pas compris votre choix.");
                chooseMenu(character);
                break;
        }
    }
}
