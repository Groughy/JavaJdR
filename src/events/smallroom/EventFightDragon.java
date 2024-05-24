package events.smallroom;

import events.Event;
import events.masterroom.EventMasterRoom;
import heroes.Persona;
import heroes.actions.ChooseMenu;
import heroes.actions.Fight;
import heroes.ennemies.Enemy;
import heroes.ennemies.animals.Dragon;

public class EventFightDragon extends Event implements Fight, ChooseMenu {
    public EventFightDragon(Persona character) {
        super("Le dragon vous charge !");
        fight(character, new Dragon());
    }

    @Override
    public void fight(Persona character, Enemy enemy) {
        fightMenu(character, enemy);
        if (character.getLifePoints() <= 0) {
            System.out.println("Vous avez été tué par le dragon.");
           startAgain();
        } else {
            System.out.println("Vous avez vaincu le dragon ! Vous pouvez : \n1. Le fouiller, \n2. Continuer votre chemin.");
            character.setKilledDragon(true);
            chooseMenu(character);
        }
    }

    @Override
    public void chooseMenu(Persona character) {
        switch (getAnswer.nextInt()) {
            case 1:
                System.out.println("Le dragon se transforme en un petit orc. Il a un dessin à la ceinture. Vous le prenez et voyez deux orcs, un grand et un plus petit. Ne sentant pas l'intérêt, vous le jetez.");
                new EventMasterRoom(character);
                break;
            case 2:
                System.out.println("Vous continuez votre chemin.");
                new EventMasterRoom(character);
                break;
            default:
                System.out.println("Je n'ai pas compris votre choix.");
                chooseMenu(character);
                break;
        }
    }
}
