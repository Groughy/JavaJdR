package events.giantroom;

import events.Event;
import heroes.Persona;
import heroes.actions.ChooseMenu;
import menus.dices.Dice100;

public class EventOrkSleeping extends Event implements ChooseMenu {

    public EventOrkSleeping(Persona character) {
        super("Un orc semble dormir dans le lit. Que faites-vous ? \n1. Vous le réveillez. \n2. Vous l'assassinez dans son sommeil. \n3. Vous regardez ailleurs et le laissez dormir.");
    }

    @Override
    public void chooseMenu(Persona character) {
        switch(getAnswer.nextLine()){
            case "1":
                new EventTalkWithOrk(character);
                break;
            case "2":
                System.out.println("Vous tentez de tuer l'orc.");
                Dice100 dice = new Dice100();
                if(dice.roll() < character.getStrengthPoints() + 10){
                    System.out.println("Vous avez réussi à tuer l'orc dans son sommeil.");
                    new EventOrkDead(character);
                } else {
                    System.out.println("L'orc se réveille et vous attaque.");
                    new EventOrkFight(character);
                }
                break;
            case "3":
                System.out.println("Vous regardez ailleurs et le laissez dormir. Vous continuez votre chemin.");
                break;
            default:
                System.out.println("Je n'ai pas compris votre choix.");
                chooseMenu(character);
                break;
        }
    }
}
