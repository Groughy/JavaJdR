package characters.races;

import characters.Character;

public abstract class Race extends Character{
    public Race(String name) {
        super(name);
        this.race = this;
    }
}
