package events.giantroom.drawers;

import events.Event;
import events.giantroom.EventSearchDresser;
import heroes.Persona;
import heroes.actions.ChooseMenu;

public class EventFifthDrawer extends Event implements ChooseMenu {
    public EventFifthDrawer(Persona character) {
        super("A l'intérieur du tiroir, vous trouvez une boîte en fer. Que faites-vous ? \n1. Vous l'ouvrez. \n2. Vous la secouez pour entendre ce qu'il y a dedans. \n3. Vous la laissez de côté et refermez le tiroir.");
        chooseMenu(character);
    }

    @Override
    public void chooseMenu(Persona character) {
        switch (getAnswer.nextInt()) {
            case 1:
                if (character.isTookArgentKeyFromEntrance()) {
                    System.out.println("Vous ouvrez la boîte, vous trouvez une amulette.");
                    character.setHasAmulet(true);
                }else if (character.isHasAmulet()) {
                    System.out.println("La boîte est déjà ouverte car vous avez déjà pris l'amulette.");
                }
                else {
                    System.out.println("Vous n'arrivez pas à ouvrir la boite. Il vous manque la clef.");
                }
                new EventSearchDresser(character);
                break;
            case 2:
                System.out.println("Vous secouez la boîte en fer. Vous entendez un bruit métallique.");
                chooseMenu(character);
                break;
            case 3:
                System.out.println("Vous laissez la boîte en fer de côté et refermez le tiroir.");
                new EventSearchDresser(character);
                break;
            default:
                System.out.println("Je n'ai pas compris votre choix.");
                chooseMenu(character);
                break;
        }
    }
}
