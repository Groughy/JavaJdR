package events.masterroom;

import events.Event;
import events.FinalChoiceMan;
import events.FinalChoiceWoman;
import heroes.Persona;
import heroes.actions.Talk;

import java.util.Objects;

public class EventTalkMaster extends Event implements Talk {
    public EventTalkMaster(Persona character) {
        super("La femme s'approche de vous, laissant ses armes à sa place.");
        talk(character);
    }

    @Override
    public void talk(Persona character) {
        if (character.isKilledDragon() && character.isKilledOrk()) {
            System.out.println("\"Vous avez tué deux des êtres les plus aimables que je puisse connaître ... Au moins, ils sont toujours ensemble. Pourquoi avoir fait un tel acte ?\"");
        }
        if (character.isKilledOrk()) {
            System.out.println("\"Vous avez osé tué un père innocent, vivant simplement pour protéger son enfant. C'était mon plus loyal et mon plus gentil sujet. Qu'avez-vous à dire pour votre défense ?\"");
        }
        if (character.isKilledDragon()) {
            System.out.println("\"Je n'ai jamais voulu que ce petit orc devienne un dragon. Mais il ne méritait pas la mort. Vous avez tué un innocent. Qu'avez-vous à dire pour votre défense ?\"");
        }
        if (character.isKilledWolf()) {
            System.out.println("\"Ce n'était pas simplement un loup perdu et affamé. C'était mon cerbère, le gardien de cette grotte. Vous auriez pu jeter un os, il l'aurait grignoté gentiment.\"");
        }
        if (character.isSkinnedWolf()) {
            System.out.println("\"Non seulement, vous l'avez tué, mais en plus, vous l'avez dépecé. On peut le voir à la marque à votre bras. Êtes-vous si désespéré pour faire ça à un animal si doux ?");
        }
        if (character.isHasAmulet()) {
            System.out.println("\"Donc le petit n'est pas mort ? Je suis impressionnée. Moi qui pensait que vous n'étiez là que pour tuer tout le monde sur votre passage.\"");
        }
        if (Objects.equals(character.getGender(), "Homme")) {
            System.out.println("Elle semble sourire, comme si elle avait trouvé un nouveau jouet.\n Elle vous dit : \"Tant que vous êtes là, et peu importe la raison d'ailleurs... Je vous propose de rester à mes côtés. Vous ne manquerez de rien et nous pourrions même commettre divers délits ensemble. Qu'en dites-vous ?\"");
            new FinalChoiceMan(character);
        }
        if (Objects.equals(character.getGender(), "Femme")) {
            System.out.println("Elle n'a pas l'air d'aimer votre présence.\n Elle vous dit : \"Je ne sais pas ce que vous faites ici, mais je vous conseille de partir. Vous n'avez rien à faire ici.\"");
            new FinalChoiceWoman(character);
        }
    }
}
