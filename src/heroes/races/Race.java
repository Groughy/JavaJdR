package heroes.races;

import heroes.Persona;

public abstract class Race extends Persona {
    protected String raceName;

    public String getRaceName() {
        return raceName;
    }

    public Race() {
        this.race = this;
    }
}
