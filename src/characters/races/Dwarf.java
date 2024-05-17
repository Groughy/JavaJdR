package characters.races;

public class Dwarf extends Race{
    public Dwarf() {
        this.raceName = "Nain";
        this.lifePoints += 25;
        this.strengthPoints += 10;
        this.magicPoints -= 5;
        this.agilityPoints -= 15;
        this.defensePoints += 20;
    }
}
