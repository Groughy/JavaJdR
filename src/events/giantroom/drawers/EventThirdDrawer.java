package events.giantroom.drawers;

import events.Event;
import events.giantroom.EventSearchDresser;
import heroes.Persona;
import heroes.actions.ChooseMenu;

import java.util.Scanner;

public class EventThirdDrawer extends Event implements ChooseMenu {
    public EventThirdDrawer(Persona character) {
        super("Vous essayez de déchiffrer le code.");
        unlockDrawer(character);
    }

    @Override
    public void chooseMenu(Persona character) {
        switch (getAnswer.nextLine()) {
            case "1":
                System.out.println("Vous prenez la clé.");
                character.setHasLittleKey(true);
                break;
            case "2":
                System.out.println("Vous ne prenez pas la clé.");
                break;
            default:
                System.out.println("Je n'ai pas compris votre choix.");
                chooseMenu(character);
                break;
        }
        new EventSearchDresser(character);
    }

    private void unlockDrawer(Persona character) {
        Scanner password = new Scanner(System.in);
        System.out.println("Entrez le code à 4 caractères : (entrez 0000 pour annuler");
        String code = password.nextLine();
        if (code.equals("l1f3")) {
            System.out.println("Le tiroir s'ouvre et vous y trouvez une minuscule clé. Est-ce que vous la prenez ? \n1. Oui. \n2. Non.");
            chooseMenu(character);
        } else if(code.equals("0000")){
            System.out.println("Vous avez annulé l'opération.");
            new EventSearchDresser(character);
        }
        else {
            System.out.println("Le code est incorrect.");
            unlockDrawer(character);
        }
    }
}
