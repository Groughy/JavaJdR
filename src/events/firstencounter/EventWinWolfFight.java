package events.firstencounter;

import events.Event;
import heroes.Persona;
import heroes.actions.ChooseMenu;

public class EventWinWolfFight extends Event implements ChooseMenu {
    public EventWinWolfFight(Persona character) {
        super("Vous avez vaincu le loup ! Vous pouvez fouiller le corps du loups, \nregarder la pièce autour de vous ou partir par la porte derrière le cadavre du loup.");
        character.setKilledWolf(true);
        chooseMenu(character);
    }

    @Override
    public void chooseMenu(Persona character) {
        System.out.println("Que voulez-vous faire ?");
        System.out.println("1 - Fouiller le corps du loup");
        System.out.println("2 - Regarder la pièce autour de vous");
        System.out.println("3 - Partir par la porte derrière le cadavre du loup");
        int choice = getAnswer.nextInt();
        switch (choice) {
            case 1:
                new EventLootWolf(character);
                break;
            case 2:
                System.out.println("Vous trouvez une épée.");
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
