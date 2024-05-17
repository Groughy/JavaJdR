package events;

import characters.Persona;

public class EventFleeFromQuest extends Event{
    public EventFleeFromQuest(Persona character){
        super("Tu as décidé de partir de là, n'imaginant à peine ce dont tu aurais pu vivre comme aventure. Cependant, le poids de la fuite est lourde sur ta conscience.");
        System.out.print("Game Over !");
    }
}
