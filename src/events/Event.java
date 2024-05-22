package events;

import heroes.Persona;
import menus.LaunchGame;

import java.util.Scanner;

public class Event {
    protected Scanner getAnswer = new Scanner(System.in);
    protected String description;
    protected Persona character;

    public Event(String Description) {
        this.description = Description;
        showDescription();
    }

    public void showDescription(){
        System.out.println(this.description);
    }


    public Event(Persona character){
        this.description = "Event";
        showDescription();
    }

    protected void startAgain() {
        System.out.print("Voulez-vous rejouer ? (oui/non) ");
        switch (getAnswer.next()) {
            case "oui":
                LaunchGame game = new LaunchGame();
                game.startGame();
                break;
            case "non":
                System.out.println("Merci d'avoir joué !");
                break;
            default:
                System.out.println("Choix invalide.");
                startAgain();
                break;
        }

    }
}
