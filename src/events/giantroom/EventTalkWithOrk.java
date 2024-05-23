package events.giantroom;

import events.Event;
import heroes.Persona;
import heroes.actions.ChooseMenu;

public class EventTalkWithOrk extends Event implements ChooseMenu {
    public EventTalkWithOrk(Persona character) {
        super("L'orc se réveille et vous regarde. Il ne semble pas comprendre ce que vous faites là puis remarque votre équipement.");
        if(character.isSkinnedWolf()){
            System.out.println("Il voit l'état de votre bras et comprends que vous avez éliminé le loup. Il soupire de soulagement car vous n'avez pas profité de son sommeil pour l'assassiner. \"Vous avez essayé d'ouvrir la porte, n'est-ce pas ? Le maître a horreur que l'on s'en prenne à son gardien.\" Vous pouvez : \n1. L'attaquer quand même. \n2. Lui poser des questions. \n3. L'ignorer.");
        }
        else{
            System.out.println("Vous pouvez : \n1. L'attaquer. \n2. Lui poser des questions. \n3. L'ignorer.");
        }
        chooseMenu(character);
    }

    @Override
    public void chooseMenu(Persona character) {
        switch (getAnswer.nextLine()) {
            case "1":
                new EventOrkFight(character);
                break;
            case "2":
                new EventOrkInformations(character);
                break;
            case "3":
                System.out.println("Vous l'ignorez et continuez votre chemin.");
                new EventGiantRoom(character);
                break;
            default:
                System.out.println("Je n'ai pas compris votre choix.");
                chooseMenu(character);
                break;
        }
    }
}
