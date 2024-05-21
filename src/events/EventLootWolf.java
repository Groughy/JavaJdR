package events;

import heroes.Persona;
import heroes.actions.Search;

public class EventLootWolf extends Event implements Search {

    public EventLootWolf(Persona character) {
        super("Le loup est mort devant vous. Vous le fouillez méticuleusement.");
        searchRoom(character);
    }

    @Override
    public void searchRoom(Persona character) {

    }
}
