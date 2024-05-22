package events.giantroom;

import events.Event;
import heroes.Persona;

public class EventSearchDresser extends Event {
    public EventSearchDresser(Persona character) {
        super("La commode présente six tiroirs différents. Lequel ouvrez-vous ?");
    }
}
