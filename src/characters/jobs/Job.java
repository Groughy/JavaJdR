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
                "Strength Points: " + this.strengthPoints + "\n" +
                "Magic Points: " + this.magicPoints + "\n" +
                "Agility Points: " + this.agilityPoints + "\n" +
                "Defense Points: " + this.defensePoints + "\n";
    }


}
