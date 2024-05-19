package menus;

import characters.Persona;
import characters.jobs.*;
import characters.races.*;
import events.EventStart;
import items.Item;
import items.equipments.armors.helmets.*;
import items.equipments.weapons.*;

import java.util.Scanner;

public class LaunchGame implements CreateCharacter {
    private Scanner getAnswer = new Scanner(System.in);

    public void startGame() {
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
        String name = getAnswer.nextLine();
        System.out.println("Bienvenue à toi, " + name + " !");
        character.setName(name);
        askGenderCharacter(character);
    }

    @Override
    public void askGenderCharacter(Persona character) {
        System.out.print("Es-tu un homme ou une femme ? (H/F)");
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
    public void defineRaceCharacter(Persona character) {
        System.out.print("De quelle espèce es-tu ? Un humain polyvalent ? Un elfe agile ? Un nain robuste ? Un ork puissant ?(H/E/N/O)");
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
    public void defineJobCharacter(Persona character) {
        System.out.print("Choisis ta classe entre un valeureux Guerrier, un ténébreux Mage ou un sournois Voleur : (G/M/R)");
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
        askToCreateEquipment(character, character.getWeapon());
    }

    @Override
    public void askToCreateEquipment(Persona character, Weapon weapon) {
        System.out.print("Veux-tu choisir ton équipement ? Oui/Non : ");
        switch (getAnswer.next().toLowerCase()) {
            case "oui", "yes", "o", "y", "" -> {
                this.chooseWeapon(character, weapon);
            }
            case "non", "no", "n" -> {
                System.out.print("Work in Progress");
                askToCreateEquipment(character, weapon);
            }
            default -> {
                System.out.println("Je n'ai pas compris ta réponse, veux-tu choisir ton équipement ? Oui/Non : ");
                askToCreateEquipment(character, weapon);
            }
        }
    }

    @Override
    public void chooseWeapon(Persona character, Weapon weapon) {
        System.out.println("Choisis ton arme : 1 - Dague, 2 - Poing, 3 - Hache, 4 - Epée courte, 5 - Epée longue, 6 - Bâton");
        switch (getAnswer.nextInt()) {
            case 1 -> {
                character.setWeapon(new Dagger(character));
                askToValidateWeapon(character, weapon);
            }
            case 2 -> {
                character.setWeapon(new Fist(character));
                askToValidateWeapon(character, weapon);
            }
            case 3 -> {
                character.setWeapon(new Axe(character));
                askToValidateWeapon(character, weapon);
            }
            case 4 -> {
                character.setWeapon(new ShortSword(character));
                askToValidateWeapon(character, weapon);
            }
            case 5 -> {
                character.setWeapon(new LongSword(character));
                askToValidateWeapon(character, weapon);
            }
            case 6 -> {
                character.setWeapon(new Staff(character));
                askToValidateWeapon(character, weapon);
            }
            default -> {
                System.out.println("Je n'ai pas compris ta réponse, veux-tu choisir ton arme ? Oui/Non : ");
                this.chooseWeapon(character, weapon);
            }
        }
    }

    @Override
    public void askToValidateWeapon(Persona character, Weapon weapon) {
        showItem(character.getWeapon());
        System.out.print("Veux-tu valider ton arme ? Oui/Non : ");
        switch (getAnswer.next().toLowerCase()) {
            case "oui", "yes", "o", "y" -> {
                chooseHelmet(character, character.getHelmet());
            }
            case "non", "no", "n" -> {
                System.out.println("Très bien !");
                chooseWeapon(character, weapon);
            }
            default -> {
                System.out.println("Je n'ai pas compris ta réponse, veux-tu valider ton arme ? Oui/Non : ");
                askToValidateWeapon(character, weapon);
            }
        }
    }

    @Override
    public void chooseHelmet(Persona character, Helmet helmet) {
        System.out.print("Choisis ton casque : 1 - Tiare, 2 - Casque en cuir, 3 - Casque en plaque");
        switch (getAnswer.nextInt()) {
            case 1 -> {
                character.setHelmet(new Tiara(character));
                askToValidateHelmet(character, helmet);
            }
            case 2 -> {
                character.setHelmet(new LeatherHelmet(character));
                askToValidateHelmet(character, helmet);
            }
            case 3 -> {
                character.setHelmet(new FlatHelmet(character));
                askToValidateHelmet(character, helmet);
            }
            default -> {
                System.out.println("Je n'ai pas compris ta réponse, veux-tu choisir ton casque ? Oui/Non : ");
                this.chooseHelmet(character, helmet);
            }
        }
    }

    @Override
    public void showCharacter(Persona character) {
        System.out.println("Voici ton personnage :"
                + "\nNom : " + character.getName()
                + "\nGenre : " + character.getGender()
                + "\nClasse : " + character.getJob().getJobName()
                + "\nRace : " + character.getRace().getRaceName()
                + "Tes caractéristiques sont : \n"
                + character.getJob().getCharacteristics() +
        "Voici ton équipement : ");
        showInventory(character);
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

    private void showInventory(Persona character) {
        System.out.print("Arme : " + character.getWeapon().getName()
                + "\nCasque : " + character.getHelmet().getName()
                + "\nArmure : " + character.getArmor().getName()
                + "\nBouclier : " + character.getShield().getName());
    }

    public void showItem(Item weapon) {
        System.out.println("Voici ton" + weapon + " : ");
        System.out.println("Nom : " + weapon.getName());
        System.out.println("Dégâts : " + weapon.getValue());
        System.out.println("Description : " + weapon.getDescription());
    }

    @Override
    public void askToValidateHelmet(Persona character, Helmet helmet) {
        showItem(character.getHelmet());
        System.out.print("Veux-tu valider ton casque ? Oui/Non : ");
        switch (getAnswer.next().toLowerCase()) {
            case "oui", "yes", "o", "y" -> {
                showCharacter(character);
            }
            case "non", "no", "n" -> {
                System.out.println("Très bien !");
                chooseHelmet(character, helmet);
            }
            default -> {
                System.out.println("Je n'ai pas compris ta réponse, veux-tu valider ton casque ? Oui/Non : ");
                askToValidateHelmet(character, helmet);
            }
        }
    }
}
