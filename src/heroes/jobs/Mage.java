package heroes.jobs;

public class Mage extends Job{
    public Mage(){
        this.jobName = "Mage";
        this.defaultLifePoints -= 10;
        this.defaultStrengthPoints -= 10;
        this.defaultMagicPoints += 20;
        this.defaultAgilityPoints -= 5;
        this.defaultDefensePoints += 5;
    }
}
