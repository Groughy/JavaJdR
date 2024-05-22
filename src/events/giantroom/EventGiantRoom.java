package events.giantroom;

import events.Event;
import heroes.Persona;

public class EventGiantRoom extends Event {
    public EventGiantRoom(Persona character) {
        super("La pièce ne vous semble pas aussi grande que la porte semblait vous le faire croire. Bien au contraire, vous avez l'impression que tout est adapté à votre taille.");
    }
}
