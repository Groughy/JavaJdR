package events;

import heroes.Persona;
import menus.dices.Dice100;

public class EventCorridor extends Event{
    public EventCorridor(Persona character) {
        super("Tu es dans un couloir plus sombre que l'entrée, dû au manque de lumière. Devant toi, des pierres semblent bloquer ta progression. Que fais-tu ? \n1. Pousser les pierres \n2. Te faufiler entre les pierres \n3. Retourner à l'entrée.");
        corridorChoice(character);
    }
    public void corridorChoice(Persona character){
        System.out.print("Tu t'approches des pierres.");
        switch (getAnswer.nextLine()){
            case "1" -> {
                System.out.print("Tu pousses les pierres beaucoup trop facilement à ton goût. Mais le chemin est désormais dégagé. Tu peux avancer avec méfiance.");
                new EventFinale(character);
            }
            case "2" -> {
                System.out.print("Tu tentes de te faufiler entre les pierres.");
                Dice100 d100 = new Dice100();
                d100.roll();
                if (d100.roll() <= character.getAgilityPoints()){
                    System.out.print("Tu te faufiles entre les pierres avec une agilité déconcertante. Tu peux avancer avec méfiance.\n");
                } else {
                    System.out.print("Tu arrives à passer, mais pas sans effort ! Tu te retrouves de l'autre côté des pierres, mais tu les as déplacées et désormais, elle bloque la sortie. Tu ne peux qu'avancer !");
                }
                new EventSeparatedPath(character);
            }
        }
    }
}
