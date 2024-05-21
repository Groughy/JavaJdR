package spells.damagespells;

import spells.Spell;

public abstract class DamageSpell extends Spell {
    protected int damage;
    public DamageSpell() {
        super("Sort de dégâts", "Inflige des dégâts à l'adversaire.");
    }

    public DamageSpell(String name, int damage, String description) {
        super(name, description);
    }
}
