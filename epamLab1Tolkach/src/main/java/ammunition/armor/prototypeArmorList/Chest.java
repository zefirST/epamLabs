package ammunition.armor.prototypeArmorList;

import ammunition.armor.Armor;

public class Chest extends Armor {
    int percentOfProtectionLevel;

    @Override
    public String toString() {
        return "Chest:"+ "\n"+
                "Weight=" + this.getWeight() +
                ", Cost=" + this.getCost() +
                ", percentOfProtectionLevel=" + percentOfProtectionLevel +
                "\n";
    }
    public String getName(){
        return "Chest";
    }

    public Chest(int cost, int weight, int level, int attributeRequirementsStrength,
                 int attributeRequirementsAgility, int attributeRequirementsIntelligence,
                 double protectionLevel, int bonusHp, int percentOfProtectionLevel) {
        super(cost, weight, level, attributeRequirementsStrength, attributeRequirementsAgility,
                attributeRequirementsIntelligence, protectionLevel, bonusHp);
        this.percentOfProtectionLevel = percentOfProtectionLevel;
    }

    public int getPercentOfProtectionLevel() {
        return percentOfProtectionLevel;
    }

    public void setPercentOfProtectionLevel(int percentOfProtectionLevel) {
        this.percentOfProtectionLevel = percentOfProtectionLevel;
    }
}