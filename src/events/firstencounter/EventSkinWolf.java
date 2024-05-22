package events.firstencounter;

import events.Event;
import heroes.Persona;
import menus.dices.Dice100;

public class EventSkinWolf extends Event {
    public EventSkinWolf(Persona character) {
        super("Vous tentez de dépecer l'animal.");
        Dice100 d100 = new Dice100();
        d100.roll();
        if (d100.roll() <= character.getStrengthPoints()) {
            System.out.print("Vous dépecez le loup avec une facilité déconcertante. Vous récupérez de la fourrure et un peu de viande. Vous pouvez essayer de manger la viande. le faites vous ? (Oui/Non)");
            switch (getAnswer.nextLine().toLowerCase()) {
                case "oui", "o", "yes", "y" -> {
                    System.out.print("Vous mangez la viande. Elle est dure et peu appétissante, mais vous avez faim.");
                    character.setLifePoints(character.getDefaultLifePoints() + 5);
                }
                default -> System.out.print("Vous jetez la viande. Sa simple vision vous dégoûte.");
            }
            character.setSkinnedWolf(true);
        } else {
            d100.roll();
            if (d100.roll() <= character.getAgilityPoints()) {
                System.out.print("Vous avez du mal à dépecer le loup, mais vous y arrivez. La fourrure est en mauvaise état et la viande majoritairement gâchée. Vous pouvez essayer de la manger tout de même. Le faites vous ? (Oui/Non)");
                switch (getAnswer.nextLine().toLowerCase()) {
                    case "oui", "o", "yes", "y" -> {
                        System.out.print("Vous mangez la viande. Elle est dure et peu appétissante, mais vous avez faim.");
                        character.setLifePoints(character.getDefaultLifePoints() + 1);
                    }
                    default -> System.out.print("Vous jetez la viande. Sa simple vision vous dégoûte.");
                }
                character.setSkinnedWolf(true);
            } else {
                System.out.print("Vous n'arrivez pas à dépecer le loup. Vous perdez du temps et de l'énergie.");
            }
        }
        new EventLootWolf(character);
    }
}
