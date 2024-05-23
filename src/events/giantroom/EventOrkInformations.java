package events.giantroom;

import events.Event;
import heroes.Persona;
import heroes.actions.ChooseMenu;
import heroes.actions.Talk;

public class EventOrkInformations extends Event implements Talk, ChooseMenu {
    public EventOrkInformations(Persona character) {
        super("Plutôt que d'attaquer ce monstre, vous essayez d'obtenir des réponses à vos questions. Quelle question voulez-vous poser ?");
        talk(character);
    }

    @Override
    public void talk(Persona character) {
        System.out.println("Plusieurs questions vous viennent à l'esprit. \n1. Qui est le maître ? \n2. Où garde-t-il le butin ? \n3. Quelle est cette salle ? \n4. Qui es-tu ? \n5. Quelle genre d'autres bestioles peux-tu trouver ici ? \n6. Comment sortir de cette salle ? \n7. Aucune.");
        chooseMenu(character);
    }

    @Override
    public void chooseMenu(Persona character) {
        switch (getAnswer.nextLine()) {
            case "1" -> {
                System.out.println("L'orc vous regarde avec un air de défi. \"Le maître est le maître. Il est puissant et il vous tuera si vous vous en prenez à lui.\"");
                character.setTalkedToOrk1(true);
                talk(character);
            }
            case "2" -> {
                System.out.println("L'orc se moque de vous. \"Il est sous votre nez depuis le début ! Mais vous n'arriverez jamais à le prendre !\"");
                character.setTalkedToOrk2(true);
                talk(character);
            }
            case "3" -> {
                System.out.println("L'orc hausse des épaules. \"C'est ma chambre, vous n'êtes pas très futé, si ?\"");
                character.setTalkedToOrk3(true);
                talk(character);
            }
            case "4" -> {
                System.out.println("\"On a jugé digne de ne pas me donner de nom. Le maître pensait que je mourrais facilement.\"");
                character.setTalkedToOrk4(true);
                talk(character);
            }
            case "5" -> {
                System.out.println("L'orc hausse un sourcil. \"Il y a des gobelins, des vampires, des goules, un scientifique fou et je crois même qu'il y a un dragon.\"");
                character.setTalkedToOrk5(true);
                talk(character);
            }
            case "6" -> {
                System.out.println("L'orc vous lance un regard désemparé. \"En utilisant la même porte par laquelle vous êtes entré.\"");
                character.setTalkedToOrk6(true);
                talk(character);
            }
            case "7" -> {
                System.out.println("Vous n'avez plus de questions. Vous remerciez l'orc et continuez votre chemin.");
                new EventGiantRoom(character);
            }
            default -> {
                System.out.println("Je n'ai pas compris votre choix.");
                chooseMenu(character);
            }
        }
    }
}
