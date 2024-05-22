package events.firstencounter;

import events.Event;
import heroes.Persona;

public class EventSkinWolf extends Event{
    public EventSkinWolf(Persona character){
        super("Vous avez pris la peau du loup. Vous pouvez maintenant sortir de la pièce.");
    }
}
