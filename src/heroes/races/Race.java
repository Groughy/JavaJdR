package heroes.races;

import heroes.Persona;

public abstract class Race extends Persona {
    protected String raceName;

    public String getRaceName() {
        return raceName;
    }

    public Race(){
        this.race = this;
    }
    public Race(String raceName, int lifePointsBonus, int strengthPointsBonus, int magicPointsBonus, int agilityPointsBonus, int defensePointsBonus) {
        this.race = this;
        this.raceName = raceName;
        this.defaultLifePoints = lifePointsBonus;
        this.defaultStrengthPoints = strengthPointsBonus;
        this.defaultMagicPoints = magicPointsBonus;
        this.defaultAgilityPoints = agilityPointsBonus;
        this.defaultDefensePoints = defensePointsBonus;
        setLifePoints(this.defaultLifePoints);
        setStrengthPoints(this.defaultStrengthPoints);
        setMagicPoints(this.defaultMagicPoints);
        setAgilityPoints(this.defaultAgilityPoints);
        setDefensePoints(this.defaultDefensePoints);
    }

}
