package events.giantroom;

import events.Event;
import heroes.Persona;
import heroes.actions.ChooseMenu;

public class EventLootOrk extends Event implements ChooseMenu {

    public EventLootOrk(Persona character) {
        super("Vous vous penchez sur l'orc décédé et trouvez une hache, un collier de dent et une bourse de pièces. Qu'est-ce que vous regardez ? \n1. La hache. \n2. Le collier de dent. \n3. La bourse de pièces. \n4. Vous regardez ailleurs.");
        chooseMenu(character);
    }

    @Override
    public void chooseMenu(Persona character) {
        switch (getAnswer.nextLine()) {
            case "1":
                if (character.isHasBattleAxe()) {
                    System.out.println("Vous avez déjà pris la hache.");
                    chooseMenu(character);
                }
                System.out.println("Vous regardez la hache. Elle est très lourde mais vous arrivez quand même à la porter. Cependant, vous ne pourrez pas vous battre avec.");
                character.setHasBattleAxe(true);
                break;
            case "2":
                if (character.isHasCollarOrk()) {
                    System.out.println("Vous avez déjà pris le collier de dent.");
                    chooseMenu(character);
                }
                System.out.println("Vous regardez le collier de dent. Il est fait de dents d'animaux et semble être un trophée de chasse.");
                character.setHasCollarOrk(true);
                break;
            case "3":
                System.out.println("Vous regardez la bourse de pièces. Elle contient des petites pierres sans intérêt.");
                break;
            case "4":
                System.out.println("Vous regardez ailleurs et continuez votre chemin.");
                new EventGiantRoom(character);
                break;
            default:
                System.out.println("Je n'ai pas compris votre choix.");
                chooseMenu(character);
                break;
        }
    }
}
