package heroes.jobs;

import heroes.Persona;

public abstract class Job extends Persona {
    protected String jobName;

    public Job() {
        this.job = this;
    }

    public String getJobName() {
        return jobName;
    }


    public String getCharacteristics() {
        return  "Life Points: " + this.lifePoints + "\n" +
                "Strength Points: " + getStrengthPoints() + "\n" +
                "Magic Points: " + getMagicPoints() + "\n" +
                "Agility Points: " + getAgilityPoints() + "\n" +
                "Defense Points: " + getDefensePoints() + "\n";
    }


}
