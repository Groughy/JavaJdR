package events;

import heroes.Persona;
import heroes.ennemies.Enemy;
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
    protected void fightMenu(Persona character, Enemy enemy) {
        while (character.getLifePoints() > 0 && enemy.getHealth() > 0) {
            System.out.println("Vous avez " + character.getLifePoints() + " points de vie.");
            System.out.println("Le "+ enemy.getName() + " a " + enemy.getHealth() + " points de vie.");
            System.out.println("Que voulez-vous faire ?");
            System.out.println("1 - Attaquer");
            System.out.println("2 - Utiliser un sort");
            int choice = getAnswer.nextInt();
            switch (choice) {
                case 1:
                    character.attack(character, enemy);
                    break;
                case 2:
                    character.castSpell(character, enemy);
                    break;
                default:
                    System.out.println("Choix invalide.");
                    break;
            }
            if (enemy.getHealth() > 0) {
                enemy.attack(character);
            }
        }
        if (character.getLifePoints() <= 0) {
            System.out.println("Vous avez perdu.");
            startAgain();
        }
    }
}
