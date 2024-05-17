package characters.races;

public class Ork extends Race{
    public Ork() {
        this.raceName = "Orc";
        this.lifePoints += 20;
        this.strengthPoints += 20;
        this.magicPoints -= 10;
        this.agilityPoints -= 5;
        this.defensePoints += 15;
    }
}
