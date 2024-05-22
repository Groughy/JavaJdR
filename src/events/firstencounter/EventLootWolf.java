package events.firstencounter;

import events.Event;
import heroes.Persona;
import heroes.actions.Search;

public class EventLootWolf extends Event implements Search {

    public EventLootWolf(Persona character) {
        super("Le loup est mort devant vous. Vous le fouillez méticuleusement.");
        searchRoom(character);
    }

    @Override
    public void searchRoom(Persona character) {
        System.out.print("Autour du cou du loup, un collier fait de chaines de mailles ainsi qu'un pendentif. En palpant le corps du loup, vous sentez la maigreur de l'animal. Mais rien qui n'attire votre attention plus que cela. Que faites-vous ? \n1. Vous prenez le collier. \2. Vous prenez juste le pendentif. \n3. Vous laissez le corps tel qu'il est. \n4. Vous décidez de dépecer le loup pour sa fourrure et le peu de viande qu'il possède.");
        switch (getAnswer.nextInt()) {
            case 1:
                new EventTakeCollar(character);
                break;
            case 2:
                new EventTakePendant(character);
                break;
            case 3:
                new EventLeaveWolf(character);
                break;
            case 4:
                new EventSkinWolf(character);
            break;
            default:
                System.out.println("Choix invalide.");
                break;
        }
    }
}
