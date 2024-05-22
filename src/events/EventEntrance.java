package events;


import heroes.Persona;
import heroes.actions.ChooseMenu;
import heroes.actions.Search;
import menus.dices.Dice100;

public class EventEntrance extends Event implements Search, ChooseMenu {
    public EventEntrance(Persona character) {
        super("Tu entres dans l'antre du voleur, traversant une rampe de pierre. Tu te retrouves dans une pièce humide, légèrement éclairée par des torches, posées sur des supports muraux en bois.");
        chooseMenu(character);
    }

    @Override
    public void chooseMenu(Persona character) {
        System.out.print(" Devant toi se trouve un couloir dont l'accès est complexe et tortueux. Que fais-tu ? \n1. Avancer dans le couloir\n2. Fouiller la pièce");
        switch (getAnswer.nextLine()) {
            case "1" -> new EventCorridor(character);
            case "2" -> searchRoom(character);
            default -> System.out.println("Je n'ai pas compris ta réponse.");

        }
    }

    @Override
    public void searchRoom(Persona character) {
        System.out.print("Tu fouilles la pièces ...");
        Dice100 d100 = new Dice100();
        d100.roll();
        if (d100.roll() <= character.getDefaultAgilityPoints()) {
            System.out.print("Tu trouves une petite clef en argent sur le sol, ainsi qu'une dague en argent sur une table. Un petit mot est attaché à la dague. Que vas-tu faire ? \n1. Prendre la clef \n2. la dague \n3. Lire le mot \n4. Ne rien faire et poursuivre ton chemin.");
            searchEntrance(character);
        } else {
            System.out.print("Tu ne trouves rien d'intéressant dans cette pièce. Tu décides de poursuivre ton chemin.");
            new EventCorridor(character);
        }
    }

    public void readMessage(Persona character) {
        switch (getAnswer.nextLine()) {
            case "1" -> {
                System.out.println("Le mot a piqué ta curiosité. Tu décides de le lire. \"Toi qui vient de pénétrer dans mon domaine, soit le bienvenue. Tu trouveras en ces lieux de nombreux dangers, combats et enigmes qui pousseront ton être à ses retranchements. Si vraiment, tu souhaites me rencontrer, pousse les rochers vers toi pour dégager le passage. \n Bon courage ! \n Signé \"Verlicious\"\"\n A la suite de cette lecture, tu ranges le mot dans tes poches.");
                character.setReadMessageEntrance(true);
                afterSearch(character);
            }
            case "2" -> {
                System.out.print("Tu ne souhaites lire le mot, peur de tomber sur un message effrayant. Tu le laisses sur la table.");
                afterSearch(character);
            }
            default -> System.out.println("Je n'ai pas compris ta réponse.");

        }
    }

    public void afterSearch(Persona character) {
        System.out.print("Après avoir observé cet objet, que fais-tu ? \n1. Prendre la clef \n2. Prendre la dague \n3. Lire le mot \n4. Ne rien faire et poursuivre ton chemin.");
        searchEntrance(character);
    }

    private void searchEntrance(Persona character) {
        switch (getAnswer.nextLine()) {
            case "1" -> {
                System.out.println("Tu prends la clef en argent. Après une inspection rapide, tu peux remarquer la présence de rune sur la clef. Sans comprendre ces runes, tu la mets dans ton sac.");
                afterSearch(character);
            }
            case "2" -> {
                System.out.print("La dague en argent devant toi est minieutieusement ouvragée. Tu la prends et la mets dans ton sac.");
                character.setTookArgentDaggerFromEntrance(true);
                afterSearch(character);
            }
            case "3" -> {
                System.out.print("Le mot semble t'être directement adressé. Tu peux le lire. Le lis-tu ? \n1. Oui \n2. Non");
                readMessage(character);
            }
            case "4" -> {
                System.out.print("Tous ces objets ne t'intéressent pas. Tu poursuis ton chemin.");
                new EventCorridor(character);
            }
            default -> {
                System.out.println("Je n'ai pas compris ta réponse.");
            }
        }
    }
}
