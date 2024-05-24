package events.smallroom;

import events.Event;
import events.masterroom.EventMasterRoom;
import heroes.Persona;

public class EventSmallRoom extends Event {
    public EventSmallRoom(Persona character) {
        super("Une fois passé la porte, vous vous rendez compte que la pièce est très grande ! Vous avez d'ailleurs une impression de déjà vu.");
        if(character.isKilledOrk()){
            System.out.println("Vous remarquez à bonne distance, une quantité immense d'un liquide rouge et poisseux.");
        }
        System.out.println("Vous continuez votre chemin, et apercevez un dragon. Il vous a vu.");
        if (character.isHasAmulet()){
            System.out.println("Le dragon s'endort et vous laisse passer.");
            character.setPetDragon(true);
            new EventMasterRoom(character);
        }
        else {
            System.out.println("Le dragon vous attaque. Vous n'avez pas le choix, vous devez vous battre.");
            new EventFightDragon(character);
        }
    }
}
