package events;

import heroes.Persona;

public class EventFinale extends Event{
    public EventFinale(Persona character) {
        super("Tu as tué le voleur fou, trouvé le trésor et sauvé le noble ! Tu as gagné !");
    }
}
