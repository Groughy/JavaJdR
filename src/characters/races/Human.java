package characters.races;

public class Human extends Race{
    public Human(String name) {
        super(name);
        this.strengthPoints += 5;
        this.magicPoints += 5;
        this.agilityPoints += 5;
        this.defensePoints += 5;
    }
}
