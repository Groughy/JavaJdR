package events.giantroom;

import events.Event;
import heroes.Persona;
import heroes.actions.ChooseMenu;
import events.giantroom.drawers.*;

public class EventSearchDresser extends Event implements ChooseMenu {
    public EventSearchDresser(Persona character) {
        super("La commode présente six tiroirs différents. Lequel ouvrez-vous ? \n1. Le premier tiroir. \n2. Le deuxième tiroir. \n3. Le troisième tiroir. \n4. Le quatrième tiroir. \n5. Le cinquième tiroir. \n6. Le sixième tiroir. \n7. Aucun, vous regardez ailleurs.");
        chooseMenu(character);
    }

    @Override
    public void chooseMenu(Persona character) {
        switch (getAnswer.nextInt()) {
            case 1:
                System.out.println("Vous ouvrez le premier tiroir. Vous y trouvez des vêtements d'enfants");
                chooseMenu(character);
                break;
            case 2:
                System.out.println("Vous essayez d'ouvrir le deuxième tiroir mais il semble bloqué.");
                new EventSecondDrawer(character);
                break;
            case 3:
                System.out.println("Vous essayez d'ouvrir le troisième tiroir mais il semble fermé et maintenu par un cadenas à code.");
                new EventThirdDrawer(character);
                break;
            case 4:
                System.out.println("Vous ouvrez le quatrième tiroir. Vous y trouvez une potion de soin.");
                new EventFourthDrawer(character);
                break;
            case 5:
                System.out.println("Vous ouvrez le cinquième tiroir.");
                new EventFifthDrawer(character);
                break;
            case 6:
                System.out.println("Vous ouvrez le sixième tiroir. Vous y trouvez des vêtements pour un orc adulte.");
                chooseMenu(character);
                break;
            case 7:
                System.out.println("Vous regardez ailleurs.");
                new EventGiantRoom(character);
                break;
            default:
                System.out.println("Choix invalide.");
                chooseMenu(character);
                break;
        }
    }
}
