package events.firstencounter;

import events.Event;
import heroes.Persona;

public class EventTakeCollar extends Event {
    public EventTakeCollar(Persona character) {
        super("Vous avez pris le collier. Vous pouvez maintenant sortir de la pièce. \n1. Voulez-vous l'inspecter ?\n2. Voulez-vous intéragir avec le loup ? \n3. Voulez-vous partir ?");

    }
}
