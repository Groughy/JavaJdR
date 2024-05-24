package events.firstencounter;

import events.Event;
import heroes.Persona;
import heroes.actions.Fight;
import heroes.ennemies.Enemy;
import heroes.ennemies.animals.Wolf;

public class EventFightWolfRoom extends Event implements Fight{
    public EventFightWolfRoom(Persona character) {
        super("Le loup vous attaque !");
        fight(character, new Wolf());
    }

    @Override
    public void fight(Persona character, Enemy enemy) {
        fightMenu(character, enemy);
        if (enemy.getHealth() <= 0) {
            new EventWinWolfFight(character);
        }
    }
}
