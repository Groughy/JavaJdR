package menus;

import java.util.Scanner;

public class LaunchGame implements CreateCharacter{
    public void startGame(){
        Scanner getAnswer = new Scanner(System.in);
        System.out.print("Veux-tu être le héros de ton aventure ? Oui/Non : ");
        switch (getAnswer.nextLine().toLowerCase()){
            case "oui", "yes", "o" -> {
                System.out.println("Alors, prépare-toi à vivre une aventure incroyable !");
                askCreateCharacter();
            }
            case "non", "no", "n" -> {
                System.out.println("Dommage, à bientôt !");
                System.exit(0);
            }
            default -> {
                System.out.println("Je n'ai pas compris ta réponse, veux-tu être le héros de ton aventure ? Oui/Non : ");
                startGame();
            }
        }
    }

    @Override
    public void askCreateCharacter() {
        {
            System.out.print("Veux-tu définir ton personnage ? Oui/Non");
            Scanner getAnswer = new Scanner(System.in);
            switch (getAnswer.nextLine().toLowerCase()){
                case "oui", "yes", "o" -> {
                    System.out.println("Allons voir ensemble ton personnage !");
                    askNameCharacter();
                }
                case "non", "no", "n" -> {
                    System.out.println("Dommage, à bientôt !");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Je n'ai pas compris ta réponse, veux-tu être le héros de ton aventure ? Oui/Non : ");
                    askCreateCharacter();
                }
            }
        }
    }

    @Override
    public void askNameCharacter() {
        System.out.print("Comment veux-tu t'appeler ? ");
        Scanner getAnswer = new Scanner(System.in);
        String name = getAnswer.nextLine();
        System.out.println("Bienvenue à toi, " + name + " !");
        defineJobCharacter();
    }

    @Override
    public void defineJobCharacter() {
        System.out.print("Choisis ta classe entre un valeureux Guerrier, un ténébreux Mage ou un sournois Voleur : (G/M/R)");
        Scanner getAnswer = new Scanner(System.in);
        switch (getAnswer.nextLine().toLowerCase()){
            case "guerrier", "warrior", "g", "w" -> {
                System.out.println("Tu as choisi d'être un Guerrier !");
            }
            case "mage", "magicien", "m" -> {
                System.out.println("Tu as choisi d'être un Mage !");
            }
            case "voleur", "rogue", "r" -> {
                System.out.println("Tu as choisi d'être un Voleur !");
            }
            default -> {
                System.out.println("Je n'ai pas compris ta réponse, veux-tu être le héros de ton aventure ? Oui/Non : ");
                defineJobCharacter();
            }
        }
    }
}
