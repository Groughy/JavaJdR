package menus;

import characters.Persona;

public interface CreateCharacter {
    void askCreateCharacter();
    void defineJobCharacter(Persona character);
    void askNameCharacter(Persona character);
    void askGenderCharacter(Persona character);
    void defineRaceCharacter(Persona character);
    void showCharacter(Persona character);
}
