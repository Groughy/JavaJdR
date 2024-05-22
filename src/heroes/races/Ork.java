package heroes.races;

public class Ork extends Race{
    public Ork() {
        this.raceName = "Orc";
        this.defaultLifePoints += 20;
        this.defaultStrengthPoints += 20;
        this.defaultMagicPoints -= 10;
        this.defaultAgilityPoints -= 5;
        this.defaultDefensePoints += 15;
    }
}
