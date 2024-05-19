package characters.jobs;

import items.equipments.armors.busts.MageToga;
import items.equipments.armors.helmets.Tiara;
import items.equipments.weapons.Staff;

public class Mage extends Job{
    public Mage(){
        this.jobName = "Mage";
        this.lifePoints -= 10;
        this.defaultStrengthPoints -= 10;
        this.defaultMagicPoints += 20;
        this.defaultAgilityPoints -= 5;
        this.defaultDefensePoints += 5;
        this.helmet = new Tiara(this);
        this.weapon = new Staff(this);
        this.bust = new MageToga(this);
    }
}
