package events.firstencounter;

import events.Event;
import heroes.Persona;
import heroes.actions.ChooseMenu;

public class EventWinWolfFight extends Event implements ChooseMenu {
    public EventWinWolfFight(Persona character) {
        super("Vous avez vaincu le loup ! Vous pouvez :  \n1. Fouiller le corps du loups. \n2. Regarder la pièce autour de vous. \n3. Partir par la porte derrière le cadavre du loup.");
        character.setKilledWolf(true);
        chooseMenu(character);
    }

    @Override
    public void chooseMenu(Persona character) {
        switch (getAnswer.nextInt()) {
            case 1:
                new EventLootWolf(character);
                break;
            case 2:
                System.out.println("La pièce ne semble qu'être une simple niche pour le loup, plus tellement si sauvage. Vous ne trouvez rien d'intéressant.");
                chooseMenu(character);
                break;
            case 3:
                new EventLeaveWolf(character);
                break;
            default:
                System.out.println("Choix invalide.");
                break;
        }
    }
}
