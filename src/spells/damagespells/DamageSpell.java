package spells.damagespells;

import characters.Persona;
import menus.dices.Dice100;
import spells.Spell;

public abstract class DamageSpell extends Spell {
    protected int damage;
    public DamageSpell() {
        super();
    }

    public DamageSpell(int i, String fireBall, int i1) {
        super();
    }

    public void cast(Persona character, Persona target) {
        System.out.print("Tu tentes d'utiliser le sort" + this.name + "...");
        Dice100 newDice = new Dice100();
        int diceRoll = newDice.roll();
        if (diceRoll >= target.getDefaultDefensePoints()){
            System.out.print("Ton sort a réussi ! Tu infliges " + this.damage + " points de dégâts à " + target.getName() + " !");
        }
        else if (diceRoll >= 90){
            System.out.print("C'est un coup critiques ! Tu infliges " + this.damage * 2 + " points de dégâts à " + target.getName() + " !");
        }
        else if (diceRoll< 10){
            System.out.print("Ta canalisation t'a explosé dans les doigts ! Tu as perdu" + damage +" points de vie ! ");
            character.setLifePoints(character.getLifePoints() - this.damage);
        }
        else {
            System.out.print("Ton sort a échoué ! " + target.getName() + " n'a subi aucun dégât.");
        }
    }
}
