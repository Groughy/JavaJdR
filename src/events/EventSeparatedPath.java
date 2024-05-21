package events;

import heroes.Persona;

public class EventSeparatedPath extends Event{
    public EventSeparatedPath(Persona character) {
        super("Devant toi, se trouve deux chemins. A gauche, un court couloir finit par une porte dont une trace de sang menant à cette dernière est visible. \nVu l'allure poisseuse, le liquide rouge est récent. A Droite, un autre couloir, plus long et dont le manque de lumière ne permet pas de voir la fin. Quel chemin vas-tu choisir ? \n1. Prendre le chemin de gauche \n2. Prendre le chemin de droite");
        choosePath(character);
    }
    private void choosePath(Persona character){
        switch (getAnswer.nextLine()){
            case "1" -> {
                System.out.print("Tu décides de prendre le chemin de gauche. Tu t'avances prudemment, la porte est entrouverte. Tu l'ouvres doucement et découvres un cadavre. Tu te retournes pour sortir, mais la porte se referme brusquement. Tu es piégé !");
                new EventFirstDoor(character);
            }
            case "2" -> {
                System.out.print("Tu décides de prendre le chemin de droite. Tu t'avances prudemment, la lumière est faible. Tu continues d'avancer et découvres une sortie. Tu es libre !");
                new EventFinale(character);
            }
            default -> System.out.print("Il faut choisir");
        }
    }
}
