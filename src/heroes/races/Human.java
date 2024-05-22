package heroes.races;

public class Human extends Race{
    public Human(){
        this.raceName = "Humain";
        this.defaultLifePoints += 5;
        this.defaultStrengthPoints += 5;
        this.defaultMagicPoints += 5;
        this.defaultAgilityPoints += 5;
        this.defaultDefensePoints += 5;
    }
}
