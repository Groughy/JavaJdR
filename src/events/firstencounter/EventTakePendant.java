package events.firstencounter;

import events.Event;
import heroes.Persona;

public class EventTakePendant extends Event {
    public EventTakePendant(Persona character){
        super("Vous avez pris le pendentif. Vous pouvez maintenant sortir de la pièce.");
    }
}
