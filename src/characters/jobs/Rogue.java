package characters.jobs;

public class Rogue extends Job{
    public Rogue() {
        this.jobName = "Rogue";
        this.defaultStrengthPoints -= 5;
        this.defaultMagicPoints -= 5;
        this.defaultAgilityPoints += 20;
        this.defaultDefensePoints += 10;
    }
}
