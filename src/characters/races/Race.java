package characters.races;

import characters.Persona;

public abstract class Race extends Persona {
    protected String raceName;

    public String getRaceName() {
        return raceName;
    }

    public Race() {
        this.race = this;
    }
}
