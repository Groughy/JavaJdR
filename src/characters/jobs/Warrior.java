package characters.jobs;

public class Warrior extends Job{

    public Warrior() {
        this.jobName = "Warrior";
        this.lifePoints += 20;
        this.defaultStrengthPoints += 10;
        this.defaultMagicPoints -= 10;
        this.defaultAgilityPoints -= 5;
        this.defaultDefensePoints += 15;
    }
}
