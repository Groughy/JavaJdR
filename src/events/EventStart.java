package events;

import java.util.Scanner;

public class EventStart extends Event{
    public EventStart(){
        super("Tout à commencer lorsque tu as accepté ce contrat, venant d'un noble que tu as rencontré dans une taverne. Il se plaignait d'avoir été volé d'un bien précieux par un voleur fou. Il t'a chargé de le récupérer. \nLorsque tu as demandé ce qu'était l'objet, il t'a simplement dit que tu le saurais quand tu le verrais. \nSans plus de détail que cela, tu as accepté la quête. En guise d'aide, il te fournit une carte et une clef. \nLe voyage jusqu'à l'antre du voleur s'est passé sans problème. Mais te voilà devant le début de ton aventure.");
        startChoice();
    }
    public void startChoice(){
        System.out.print("Tu es devant l'antre du voleur fou, que veux-tu faire ?\n1. Entrer\n2. Regarder autour de toi\n3. Partir\n");
        Scanner getAnswer = new Scanner(System.in);
        switch (getAnswer.nextLine()){
            case "1" :
                System.out.println("Tu entres dans l'antre du voleur fou, sans regarder derrière toi, seul les faibles fuient devant le danger."); new EventFinale();
            case "2" :
                new EventLookAroundStart();
            case "3" :
                new EventFleeFromQuest();
            default :
                System.out.println("Je n'ai pas compris ta réponse.");
        }
    }
}
