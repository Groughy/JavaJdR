package events.masterroom;

import events.Event;
import heroes.Persona;
import heroes.actions.ChooseMenu;

public class EventWinMasterFight extends Event implements ChooseMenu {
    public EventWinMasterFight(Persona character) {
        super("Vous avez vaincu le maître des lieux ! Vous pouvez : \n1. Restez ici. \n2. Rendre l'objet que vous êtes venu chercher.");
        chooseMenu(character);
    }

    @Override
    public void chooseMenu(Persona character) {
        switch (getAnswer.nextInt()) {
            case 1:
                System.out.println("Vous voyez la montagne d'or derrière votre dernière victime. Vous n'avez pas vu tout ce dont la grotte pouvait vous offrir en défi mais cela n'importait que peu. Cette grotte était désormais la votre. Par rapport à votre quête, vous l'avez complètement snobé, vous en avez plus besoin et aux yeux du noble, vous êtes morts dès que vous l'avez accepté. \nVous avez obtenu la fin \"Maître cupide !\".");
                System.exit(0);
            case 2:
                System.out.println("Vous cherchez dans la montagne d'or derrière votre dernière victime, l'objet dont vous aviez besoin. L'idée de rester en ces lieux ne vous a même pas effleuré l'esprit. Vous avez ce besoin d'être connecté à la vie citadine. Le noble vous paie généreusement pour avoir accompli la quête, mais c'était surtout sur le fait qu'il n'imaginait pas vous voir en vie. \nVous avez obtenue la fin \"Survivant de l'enfer\".");
                System.exit(0);
            default:
                System.out.println("Je n'ai pas compris votre choix.");
                chooseMenu(character);
                break;
        }
    }
}
