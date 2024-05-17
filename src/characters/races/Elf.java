package characters.races;

public class Elf extends Race{
    public Elf() {
        this.raceName = "Elfe";
        this.strengthPoints -= 5;
        this.magicPoints += 15;
        this.agilityPoints += 15;
        this.defensePoints += 5;
    }
}
