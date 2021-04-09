package ammunition.armor.prototypeArmorList;

import ammunition.armor.Armor;

public class PairOfBags extends Armor {
    boolean chafingOrNot;

    @Override
    public String toString() {
        return "PairOfBags:"+ "\n" +
                "Weight=" + this.getWeight() +
                ", Cost=" + this.getCost() +
                ", chafingOrNot=" + this.chafingOrNot() +
                "\n";
    }

    public PairOfBags(int cost, int weight, int level, int attributeRequirementsStrength,
                      int attributeRequirementsAgility, int attributeRequirementsIntelligence,
                      double protectionLevel, int bonusHp, boolean chafingOrNot) {
        super(cost, weight, level, attributeRequirementsStrength, attributeRequirementsAgility,
                attributeRequirementsIntelligence, protectionLevel, bonusHp);
        this.chafingOrNot = chafingOrNot;
    }

    public String getName(){
        return "PairOfBags";
    }

    public String chafingOrNot() {
        if (chafingOrNot == false)
            return "You're nice one";
        else
            return "Bad luck";
    }

    public boolean isChafingOrNot() {
        return chafingOrNot;
    }

    public void setChafingOrNot(boolean chafingOrNot) {
        this.chafingOrNot = chafingOrNot;
    }
}
