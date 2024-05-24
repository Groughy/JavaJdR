package events.giantroom;

import events.Event;
import heroes.Persona;
import heroes.actions.Fight;
import heroes.ennemies.Enemy;
import heroes.ennemies.humanoids.Ork;

public class EventOrkFight extends Event implements Fight {
    public EventOrkFight(Persona character) {
        super("L'orc est face à vous et semble forcé de vous attaquer.");
        fight(character, new Ork());
    }

    @Override
    public void fight(Persona character, Enemy enemy) {
        fightMenu(character, enemy);
        if (enemy.getHealth() <= 0) {
            new EventOrkDead(character);
        }
    }


}
