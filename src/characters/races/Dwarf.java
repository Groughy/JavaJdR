package characters.races;

public class Dwarf extends Race{
    public Dwarf(String name) {
        super(name);
        this.strengthPoints += 10;
        this.magicPoints -= 5;
        this.agilityPoints -= 15;
        this.defensePoints += 20;
    }
}
