package menus;

import characters.Persona;
import characters.jobs.*;
import characters.races.*;
import events.EventStart;

import java.util.Scanner;

public class LaunchGame implements CreateCharacter {
    public void startGame() {
        Scanner getAnswer = new Scanner(System.in);
        System.out.print("Veux-tu être le héros de ton aventure ? Oui/Non : ");
        switch (getAnswer.nextLine().toLowerCase()) {
            case "oui", "yes", "o", "y" -> {
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
            System.out.print("Veux-tu définir ton personnage ? Oui/Non : ");
            Scanner getAnswer = new Scanner(System.in);
            switch (getAnswer.nextLine().toLowerCase()) {
                case "oui", "yes", "o", "y" -> {
                    System.out.println("Allons voir ensemble ton personnage !");
                    Persona character = new Persona();
                    askNameCharacter(character);
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
    public void askNameCharacter(Persona character) {
        System.out.print("Comment veux-tu t'appeler ? ");
        Scanner getAnswer = new Scanner(System.in);
        String name = getAnswer.nextLine();
        System.out.println("Bienvenue à toi, " + name + " !");
        character.setName(name);
        askGenderCharacter(character);
    }

    @Override
    public void askGenderCharacter(Persona character) {
        System.out.print("Es-tu un homme ou une femme ? (H/F)");
        Scanner getAnswer = new Scanner(System.in);
        switch (getAnswer.nextLine().toLowerCase()) {
            case "homme", "h" -> {
                System.out.println("Tu as choisi d'être un homme !");
                character.setGender("Homme");
                defineRaceCharacter(character);
            }
            case "femme", "f" -> {
                System.out.println("Tu as choisie d'être une femme !");
                character.setGender("Femme");
                defineRaceCharacter(character);
            }
            default -> {
                System.out.println("Je n'ai pas compris ta réponse");
                askGenderCharacter(character);
            }
        }
    }
        @Override
        public void defineJobCharacter (Persona character){
            System.out.print("Choisis ta classe entre un valeureux Guerrier, un ténébreux Mage ou un sournois Voleur : (G/M/R)");
            Scanner getAnswer = new Scanner(System.in);
            switch (getAnswer.nextLine().toLowerCase()) {
                case "guerrier", "warrior", "g", "w" -> {
                    System.out.println("Tu as choisi d'être un Guerrier !");
                    character.setJob(new Warrior());
                }
                case "mage", "magicien", "m" -> {
                    System.out.println("Tu as choisi d'être un Mage !");
                    character.setJob(new Mage());
                }
                case "voleur", "rogue", "r" -> {
                    System.out.println("Tu as choisi d'être un Voleur !");
                    character.setJob(new Rogue());
                }
                default -> {
                    System.out.println("Je n'ai pas compris ta réponse, veux-tu être le héros de ton aventure ? Oui/Non : ");
                    defineJobCharacter(character);
                }
            }
            showCharacter(character);
        }

        @Override
        public void defineRaceCharacter (Persona character){
            System.out.print("De quelle espèce es-tu ? Un humain polyvalent ? Un elfe agile ? Un nain robuste ? Un ork puissant ?(H/E/N/O)");
            Scanner getAnswer = new Scanner(System.in);
            switch (getAnswer.nextLine().toLowerCase()) {
                case "humain", "human", "h" -> {
                    System.out.println("Tu as choisi d'être un Humain !");
                    character.setRace(new Human());
                }
                case "elfe", "elf", "e" -> {
                    System.out.println("Tu as choisi d'être un Elfe !");
                    character.setRace(new Elf());
                }
                case "nain", "dwarf", "n" -> {
                    System.out.println("Tu as choisi d'être un Nain !");
                    character.setRace(new Dwarf());
                }
                case "ork", "orc", "o" -> {
                    System.out.println("Tu as choisi d'être un Ork !");
                    character.setRace(new Ork());
                }
                default -> {
                    System.out.println("Je n'ai pas compris ta réponse, veux-tu être le héros de ton aventure ? Oui/Non : ");
                    defineRaceCharacter(character);
                }
            }
            defineJobCharacter(character);
        }

        @Override
        public void showCharacter (Persona character){
            System.out.println("Voici ton personnage : ");
            System.out.println("Nom : " + character.getName());
            System.out.println("Genre : " + character.getGender());
            System.out.println("Classe : " + character.getJob().getJobName());
            System.out.println("Race : " + character.getRace().getRaceName());
            System.out.println("Tes caractéristiques sont : " + character.getJob().getCharacteristics());
            System.out.println("");
            System.out.print("Veux-tu modifier ton personnage ? Oui/Non : ");
            Scanner getAnswer = new Scanner(System.in);
            switch (getAnswer.nextLine().toLowerCase()) {
                case "oui", "yes", "o", "y" -> {
                    System.out.println("Retournons voir ensemble ton personnage !");
                    askNameCharacter(character);
                }
                case "non", "no", "n" -> {
                    new EventStart(character);
                }
                default -> {
                    System.out.println("veux-tu être le héros de ton aventure ? Oui/Non : ");
                    showCharacter(character);
                }
            }
        }
    }
