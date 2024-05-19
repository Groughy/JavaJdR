package menus;

import characters.Persona;
import items.equipments.armors.helmets.Helmet;
import items.equipments.weapons.Weapon;

public interface CreateCharacter {
    void askCreateCharacter();
    void defineJobCharacter(Persona character);
    void askNameCharacter(Persona character);
    void askGenderCharacter(Persona character);
    void defineRaceCharacter(Persona character);
    void showCharacter(Persona character);
    void askToCreateEquipment(Persona character, Weapon weapon);
    void chooseWeapon(Persona character, Weapon weapon);
    void askToValidateWeapon(Persona character, Weapon weapon);
    void chooseHelmet(Persona character, Helmet helmet);
    void askToValidateHelmet(Persona character, Helmet helmet);
}
