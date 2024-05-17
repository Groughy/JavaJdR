package characters.jobs;

public class Rogue extends Job{
    public Rogue(String name) {
        super(name);
        this.strengthPoints -= 5;
        this.magicPoints -= 5;
        this.agilityPoints += 20;
        this.defensePoints += 10;
    }
}
