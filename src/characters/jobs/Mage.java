package characters.jobs;

public class Mage extends Job{
    public Mage(){
        this.jobName = "Mage";
        this.lifePoints -= 10;
        this.strengthPoints -= 10;
        this.magicPoints += 20;
        this.agilityPoints -= 5;
        this.defensePoints += 5;
    }
}
