package events.firstencounter;

import events.Event;
import heroes.Persona;
import heroes.actions.Fight;
import heroes.ennemies.Enemy;
import heroes.ennemies.animals.Wolf;
import menus.LaunchGame;

public class EventFightWolfRoom extends Event implements Fight{
    public EventFightWolfRoom(Persona character) {
        super("Le loup vous attaque !");
        fight(character, new Wolf());
    }

    @Override
    public void fight(Persona character, Enemy enemy) {
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
                    character.castSpell(character,enemy);
                    break;
                default:
                    System.out.println("Choix invalide.");
                    break;
            }
            if (enemy.getHealth() > 0) {
                enemy.attack(character);
            }
        }
        if (enemy.getHealth() <= 0) {
            new EventWinWolfFight(character);
        }
        if (character.getLifePoints() <= 0) {
            System.out.println("Vous avez perdu.");
            startAgain();
        }
    }

    private void startAgain() {
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
