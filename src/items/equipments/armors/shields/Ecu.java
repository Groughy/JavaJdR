package items.equipments.armors.shields;

public class Ecu extends Shield{
    public Ecu(String name, int value, String description) {
        super(name, value, description);
    }
    public Ecu() {
        super("Ecu", 20, "Un bouclier suffisamment imposant pour arrêter les flèches et les coups d'épée.");
    }
}
