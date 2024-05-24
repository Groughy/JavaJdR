package events;

import heroes.Persona;
import events.masterroom.EventFightMaster;
import heroes.actions.ChooseMenu;

public class FinalChoiceMan extends Event implements ChooseMenu {
    public FinalChoiceMan(Persona character) {
        super("Vous pouvez : \n1. Rester avec elle \n2. L'attaquer \n3. Partir");
        chooseMenu(character);
    }

    @Override
    public void chooseMenu(Persona character) {
        switch (getAnswer.nextInt()) {
            case 1:
                System.out.println("Vous avez choisi de passer le restant de votre vie en sa compagnie. Et vous le regrettez. Votre liberté n'est même plus une notion dans votre esprit, la sentant plus proche d'une utopie qu'autre chose. \nVous avez obtenu la fin \"Enchaîné\"");
                System.exit(0);
            case 2:
                new EventFightMaster(character);
                break;
            case 3:
                System.out.println("Vous avez préféré partir avec l'objet. Elle ne vous a pas empêché, vous lançant l'objet et vous souhaitant bon courage pour la fin. Vous retournez rendre l'objet au noble qui vous paye généreusement, imaginant surtout que vous étiez mort durant la quête. Après celà, vous disparaissez loin de la ville. \nVous avez obtenu la fin \"Libre\".");
                System.exit(0);
            default:
                System.out.println("Je n'ai pas compris votre choix.");
                chooseMenu(character);
                break;
        }
    }
}
