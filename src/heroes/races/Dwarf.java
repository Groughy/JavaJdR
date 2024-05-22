package heroes.races;

public class Dwarf extends Race{
    public Dwarf() {
        this.raceName = "Nain";
        this.defaultLifePoints += 25;
        this.defaultStrengthPoints += 10;
        this.defaultMagicPoints -= 5;
        this.defaultAgilityPoints -= 15;
        this.defaultDefensePoints += 20;
    }
}
