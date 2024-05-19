package characters.jobs;

import characters.Persona;

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
                "Strength Points: " + this.defaultStrengthPoints + "\n" +
                "Magic Points: " + this.defaultMagicPoints + "\n" +
                "Agility Points: " + this.defaultAgilityPoints + "\n" +
                "Defense Points: " + this.defaultDefensePoints + "\n";
    }


}
