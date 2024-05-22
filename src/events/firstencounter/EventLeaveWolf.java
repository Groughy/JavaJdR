package events.firstencounter;

import events.Event;
import heroes.Persona;

public class EventLeaveWolf extends Event{
    public EventLeaveWolf(Persona character) {
        super("Le loup ne vous intéresse plus. Vous vous dirigez vers la porte derrière lui.");
        new EventDoorBehindWolf(character);
    }
}
