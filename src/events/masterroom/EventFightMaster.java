package events.masterroom;

import events.Event;
import heroes.Persona;
import heroes.actions.Fight;
import heroes.ennemies.Enemy;
import heroes.ennemies.humanoids.Master;

public class EventFightMaster extends Event implements Fight{
    public EventFightMaster(Persona character) {
        super("La femme vous attaque !");
        fight(character, new Master());
    }

    @Override
    public void fight(Persona character, Enemy enemy) {
        fightMenu(character, enemy);
        if (enemy.getHealth() <= 0) {
            new EventWinMasterFight(character);
        }
    }
}
