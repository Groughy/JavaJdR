package heroes;

import java.util.Scanner;

import heroes.ennemies.Enemy;
import heroes.jobs.Job;
import heroes.races.Race;
import items.equipments.armors.helmets.Helmet;
import items.equipments.armors.busts.Bust;
import items.equipments.armors.shields.Shield;
import items.equipments.weapons.Weapon;
import menus.dices.Dice100;
import menus.dices.Dice4;

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
    protected Scanner getAnswer = new Scanner(System.in);

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

    public void attack(Persona character, Enemy enemy) {
        System.out.print("Vous tendez votre " + character.getWeapon().getName() + " et attaquez le " + enemy.getName() + " !");
        Dice100 dice = new Dice100();
        int diceRoll = dice.roll();
        if (diceRoll + character.getStrengthPoints() >= enemy.getAgility() +enemy.getDefense()){
            int damage = character.getDamage() - enemy.getDefense();
            enemy.setHealth(enemy.getHealth() - damage);
            System.out.println("Vous infligez " + damage + " points de dégâts au " + enemy.getName() + " !");
        } else {
            System.out.println("Vous ratez votre attaque !");
        }
    }
    public void castSpell(Persona character, Enemy enemy) {
        System.out.println("Quel sort voulez-vous lancer ? \1. Un sort d'attaque.\2. Un sort de soin.");
        switch (getAnswer.nextInt()) {
            case 1:
                System.out.println("Vous lancez un sort d'attaque !");
                break;
            case 2:
                System.out.println("Vous lancez un sort de soin !");
                break;
            default:
                System.out.println("Choix invalide.");
                break;
        }
    }
    public void castDamageSpell(Persona character, Enemy enemy) {
        System.out.print("Tu tentes d'utiliser un sort de...");
        Dice4 newDice = new Dice4();
        int diceRoll = newDice.roll();
        switch (diceRoll) {
            case 1:
                System.out.println("Boule de feu !");
                break;
            case 2:
                System.out.println("Piqure d'insecte !");
                break;
            case 3:
                System.out.println("Jet d'éclair !");
                break;
            case 4:
                System.out.println("Rien du tout, tu as raté ton sort !");
            default:
                System.out.println("Erreur !");
                break;
        }
    }
}