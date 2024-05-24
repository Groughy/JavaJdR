package events.giantroom;

import events.Event;
import events.EventPath;
import heroes.Persona;
import heroes.actions.Search;
import heroes.actions.ChooseMenu;

public class EventGiantRoom extends Event implements Search, ChooseMenu {
    public EventGiantRoom(Persona character) {
        super("La pièce ne vous semble pas aussi grande que la porte semblait vous le faire croire. Bien au contraire, vous avez l'impression que tout est adapté à votre taille. Vous pouvez fouiller la pièce.");
        searchRoom(character);
    }

    @Override
    public void searchRoom(Persona character) {
        System.out.println("En regardant autour de vous, il s'agirait d'une pièce à coucher. Entre le miroir, le lit et la commode, tout semble croire que la pièce est habitée. Vous pouvez regarder dans \n1. Le lit \n2. La commode \n3. Le mirroir \n4. Sortir.");
        chooseMenu(character);
    }

    @Override
    public void chooseMenu(Persona character) {
        switch (getAnswer.nextLine()) {
            case "1":
                if (character.isKilledOrk()) {
                    System.out.print("Vous retournez voir l'orc mort");
                    new EventOrkDead(character);
                }
                new EventLookBed(character);
                break;
            case "2":
                new EventSearchDresser(character);
                break;
            case "3":
                if (character.isSkinnedWolf()) {
                    if (!character.isTookDamageFromMirror()) {
                        System.out.println("Vous regardez dans le miroir. Vous y voyez votre reflet et la vision de votre bras en sang ravive la douleur que vous ressentez.");
                        character.setLifePoints(character.getLifePoints() - 2);
                        character.setTookDamageFromMirror(true);
                        if (character.getLifePoints() <= 0) {
                            System.out.print("Vous êtes mort. Votre reflet vous a tué !");
                            startAgain();
                        }
                    }
                }
                System.out.print("Vous inspectez le miroir plus en profondeur et des caractères semblent apparaître comme s'ils étaient gravés derrière vous. En vous retournant, vous ne voyez rien. Les caractères donnent \"L1f3\".");
                chooseMenu(character);
                break;
            case "4":
                System.out.println("Vous avez décidé de sortir de la pièce.");
                new EventPath(character);
            default:
                System.out.println("Choix invalide.");
                break;
        }
    }
}
