package events;

import events.firstencounter.EventFightWolfRoom;
import heroes.Persona;
import heroes.actions.ChooseMenu;

public class EventFirstDoor extends Event implements ChooseMenu {
    public EventFirstDoor(Persona character) {
        super("Tu as choisi le chemin menant à une porte d'où coule du sang. Tes pas se mêlent aux traces de sang. \nTu arrives devant la porte et entends des grognements derrière cette dernière. Un animal sauvage semblent être présent. Que vas-tu faire ? \n1. Ouvrir la porte \n2. Retourner sur tes pas");
        chooseMenu(character);
    }

    @Override
    public void chooseMenu(Persona character) {
        switch (getAnswer.nextLine()){
            case "1" -> {
                System.out.print("Tu ouvres la porte et découvres un gros loup dévorant une proie. Certainement un autre aventurier malchanceux. Il lâche son repas et grogne dans ta direction. Tu n'as plus le choix, tu dois combattre.");
                new EventFightWolfRoom(character);
            }
            case "2" -> {
                System.out.print("Tu décides de rebrousser chemin. Tu retournes sur tes pas et prends le chemin de droite.");
                new EventSeparatedPath(character);
            }
            default -> System.out.print("Il faut choisir");
        }

    }
}
