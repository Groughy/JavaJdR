package characters;

import characters.jobs.Job;
import characters.races.Race;
import items.equipments.armors.helmets.Helmet;
import items.equipments.armors.busts.Bust;
import items.equipments.armors.shields.Shield;
import items.equipments.weapons.Weapon;

public class Persona {
    protected String name;
    protected Race race;
    protected Job job;
    protected String gender;
    protected int lifePoints;
    protected int defaultStrengthPoints;
    protected int defaultMagicPoints;
    protected int defaultAgilityPoints;
    protected int defaultDefensePoints;
    protected int strengthPoints;
    protected int magicPoints;
    protected int agilityPoints;
    protected int defensePoints;
    protected Weapon weapon;
    protected Helmet helmet;
    protected Bust bust;
    protected Shield shield;
    protected int damage;

    public Persona() {
        this.lifePoints = 100;
        this.defaultStrengthPoints = 10;
        this.defaultMagicPoints = 10;
        this.defaultAgilityPoints = 10;
        this.defaultDefensePoints = 10;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public int getDefaultStrengthPoints() {
        return defaultStrengthPoints;
    }

    public void setDefaultStrengthPoints(int defaultStrengthPoints) {
        this.defaultStrengthPoints = defaultStrengthPoints;
    }

    public int getDefaultMagicPoints() {
        return defaultMagicPoints;
    }

    public int getDefaultAgilityPoints() {
        return defaultAgilityPoints;
    }

    public int getDefaultDefensePoints() {
        return defaultDefensePoints;
    }

    public int getStrengthPoints() {
        return strengthPoints + defaultStrengthPoints;
    }

    public void setStrengthPoints(int strengthPoints) {
        this.strengthPoints = strengthPoints;
    }

    public int getMagicPoints() {
        return magicPoints + defaultMagicPoints;
    }

    public void setMagicPoints(int magicPoints) {
        this.magicPoints = magicPoints;
    }

    public int getAgilityPoints() {
        return agilityPoints + defaultAgilityPoints;
    }

    public void setAgilityPoints(int agilityPoints) {
        this.agilityPoints = agilityPoints;
    }

    public int getDefensePoints() {
        return defensePoints + defaultDefensePoints;
    }

    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

    public Helmet getHelmet() {
        return helmet;
    }

    public Bust getArmor() {
        return bust;
    }

    public Shield getShield() {
        return shield;
    }

    public void setHelmet(Helmet helmet) {
        this.helmet = helmet;
    }

    public void setArmor(Bust bust) {
        this.bust = bust;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }
}
