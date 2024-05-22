package events.giantroom;

import events.Event;
import heroes.Persona;

public class EventOrkDead extends Event {
    public EventOrkDead(Persona character) {
        super("L'orc git mort à vos pieds. Vous pouvez le fouiller ou continuer vos recherches. Que faites-vous ? \n1. Vous le fouillez. \n2. Vous continuez votre chemin.");
    }
}
