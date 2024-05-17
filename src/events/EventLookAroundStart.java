package events;

import characters.Persona;

public class EventLookAroundStart extends Event{
    public EventLookAroundStart(Persona character) {
        super("L'endroit est désert, à la sortie d'une forêt épaisse qui ne laisse aucunement passer la lumière. Les seuls bruits que tu entends auprès de toi restent ceux des animaux sauvages non loin. Il va te falloir choisir ...");
        lookAroundChoice(character);
    }
    public void lookAroundChoice(Persona character){
        System.out.print("Regarder autour n'a mené à rien, que vas-tu faire ? \n1. Entrer dans l'antre\n2. Partir\n");
        switch (getAnswer.nextLine()){
            case "1" -> {
                new EventEntrance(character);
                break;
            }
            case "2" -> {
                new EventFleeFromQuest(character);
                break;
            }
            default -> {
                System.out.println("Je n'ai pas compris ta réponse.");
            }
        }
    }
}
