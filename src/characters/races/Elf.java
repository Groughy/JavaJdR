package characters.races;

public class Elf extends Race{
    public Elf() {
        this.raceName = "Elfe";
        this.defaultStrengthPoints -= 5;
        this.defaultMagicPoints += 15;
        this.defaultAgilityPoints += 15;
        this.defaultDefensePoints += 5;
    }
}
