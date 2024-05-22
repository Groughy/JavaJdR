package events;

import events.giantroom.EventGiantDoor;
import events.smallroom.EventSmallDoor;
import heroes.Persona;
import heroes.actions.ChooseMenu;
import menus.dices.Dice100;

public class EventPath extends Event implements ChooseMenu {
    public EventPath(Persona character) {
        super("La porte finit par s'ouvrir et vous vous retrouvez dans un nouveau couloir.");
        if (character.isSkinnedWolf()) {
            System.out.println("Après l'immense douleur que vous venez de ressentir, vous êtes d'autant plus méfiant aux pièces qui pourraient être présent dans ce couloir.");
            Dice100 dice = new Dice100();
            int diceRoll = dice.roll();
            if (diceRoll - 25 < character.getAgilityPoints()) {
                System.out.print("Vous évitez de justesse une dalle piégée juste devant vous.");
            } else {
                System.out.println("Vous marchez sur une dalle piégée.");
                Dice100 trap = new Dice100();
                int trapRoll = trap.roll();
                if (trapRoll - 15 < character.getAgilityPoints()) {
                    System.out.println("Vous esquivez une lance prête à vous planter, qui sortait du mur.");
                }
                else{
                    System.out.println("Vous vous prenez la lance en pleine poitrine.");
                    character.setLifePoints(character.getLifePoints() - 10);
                    if (character.getLifePoints() <= 0) {
                        System.out.println("Vous vous effondrez au sol, mort.");
                        startAgain();
                    }
                }
            }
        }
        System.out.println("Vous arrivez au bout du couloir. Il y a deux portes devant vous, \n1. une très grand \n2.une plus petite. Laquelle choisissez-vous ?");
        chooseMenu(character);
    }

    @Override
    public void chooseMenu(Persona character) {
switch (getAnswer.nextInt()) {
        case 1:
            new EventGiantDoor(character);
            break;
        case 2:
            new EventSmallDoor(character);
            break;
        default:
            System.out.println("Choix invalide.");
            break;
    }
    }
}