package events.giantroom;

import events.Event;
import heroes.Persona;
import heroes.actions.Fight;
import heroes.ennemies.Enemy;
import heroes.ennemies.Ork;

public class EventOrkFight extends Event implements Fight {
    public EventOrkFight(Persona character) {
        super("character");
        fight(character, new Ork());
    }

    @Override
    public void fight(Persona character, Enemy enemy) {

    }
}
