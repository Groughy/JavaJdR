package characters.jobs;

public class Warrior extends Job{

    public Warrior() {
        this.jobName = "Warrior";
        this.lifePoints += 20;
        this.strengthPoints += 10;
        this.magicPoints -= 10;
        this.agilityPoints -= 5;
        this.defensePoints += 15;
    }
}
