package events.firstencounter;

import events.Event;
import heroes.Persona;
import heroes.actions.ChooseMenu;

public class EventTakePendant extends Event implements ChooseMenu{
    public EventTakePendant(Persona character){
        super("Vous avez pris le pendentif. \n1.Vous pouvez l'examiner. \n2.Vous pouvez intéragir avec le loup. \n3.Vous pouvez partir.");
        character.setTookPendantWolf(true);
        chooseMenu(character);
    }

    @Override
    public void chooseMenu(Persona character) {
    switch (getAnswer.nextInt()){
            case 1:
                System.out.println("Vous examinez le pendentif. A l'intérieur du bijoux se trouve un petit morceau de papier. Voulez-vous le lire ? (Oui/Non)");
                switch (getAnswer.nextLine().toLowerCase()){
                    case "oui", "o", "yes", "y" -> {System.out.println("Vous dépliez le papier. Il est écrit : \"Vous qui avez vaincu mon animal favoris, le cerbère de mon antre, sachez qu'une chose ... Oeil pour oeil, dent pour dent.\"");
                    character.setReadMessageFromPendant(true);}
                    default -> System.out.println("Vous remettez le papier dans le pendentif.");
                }
            case 2:
                new EventLootWolf(character);
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
