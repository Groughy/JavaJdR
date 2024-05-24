package events.giantroom.drawers;

import events.Event;
import events.giantroom.EventSearchDresser;
import heroes.Persona;
import heroes.actions.ChooseMenu;
import menus.dices.Dice100;

public class EventSecondDrawer extends Event implements ChooseMenu {
    public EventSecondDrawer(Persona character) {
        super("Vous essayez d'ouvrir le deuxième tiroir mais il semble bloqué. Vous pouvez essayez de : \n1. Le forcer. \n2. le débloquer \n3. Ne rien faire et regardez ailleurs.");
        chooseMenu(character);
    }

    @Override
    public void chooseMenu(Persona character) {
        Dice100 dice = new Dice100();
        int roll = dice.roll();
        switch (getAnswer.nextInt()) {
            case 1:
                if(character.isOpenedSecondDrawer()){
                    System.out.println("Le tiroir est déjà ouvert.");
                    new EventSearchDresser(character);
                    break;
                }
                if (roll <= character.getStrengthPoints()){
                    System.out.println("Vous forcez le tiroir et vous trouvez un dessin fait par un enfant représentant deux orcs, un grand et un petit. Vous le trouvez sans importance et le laissez à sa place.");
                    character.setOpenedSecondDrawer(true);
                    new EventSearchDresser(character);
                } else {
                    System.out.println("Vous forcez sur le tiroir mais n'arrivez pas à l'ouvrir.");
                    chooseMenu(character);
                }
                break;
            case 2:
                if(character.isOpenedSecondDrawer()){
                    System.out.println("Le tiroir est déjà ouvert.");
                    new EventSearchDresser(character);
                    break;
                }
                System.out.println("Vous essayez de débloquer le tiroir mais sans succès.");
                if (roll <= character.getAgilityPoints()){
                    System.out.println("Vous forcez le tiroir et vous trouvez un dessin fait par un enfant représentant deux orcs, un grand et un petit. Vous le trouvez sans importance et le laissez à sa place.");
                    character.setOpenedSecondDrawer(true);
                    new EventSearchDresser(character);
                } else {
                    System.out.println("Vous forcez sur le tiroir mais n'arrivez pas à l'ouvrir.");
                    chooseMenu(character);
                }
                break;
            case 3:
                System.out.println("Vous regardez ailleurs.");
                new EventSearchDresser(character);
                break;
            default:
                System.out.println("Choix invalide.");
                chooseMenu(character);
                break;
        }
    }
}
