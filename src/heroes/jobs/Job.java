package heroes.jobs;

import heroes.Persona;

public abstract class Job extends Persona {
    public String jobName;

    public String getJobName() {
        return jobName;
    }

    public Job() {
        this.job = this;
    }

    public Job(String jobName, int lifePointsBonus, int strengthPointsBonus, int magicPointsBonus, int agilityPointsBonus, int defensePointsBonus) {
        this.job = this;
        this.jobName = jobName;
        this.defaultLifePoints = lifePointsBonus;
        this.defaultStrengthPoints = strengthPointsBonus;
        this.defaultMagicPoints = magicPointsBonus;
        this.defaultAgilityPoints = agilityPointsBonus;
        this.defaultDefensePoints = defensePointsBonus;
        setLifePoints(this.defaultLifePoints);
        this.strengthPoints = this.defaultStrengthPoints;
        this.magicPoints = this.defaultMagicPoints;
        this.agilityPoints = this.defaultAgilityPoints;
        this.defensePoints = this.defaultDefensePoints;
    }
}
