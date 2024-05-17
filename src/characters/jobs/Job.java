package characters.jobs;

import characters.Character;

public abstract class Job extends Character{

    public Job(String name) {
        super(name);
        this.job = this;
    }
}
