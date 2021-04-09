package ammunition.armor.prototypeArmorList;

import ammunition.armor.Armor;

public class Shield extends Armor {
    int blockChance;

    @Override
    public String toString() {
        return "Shield:"+ "\n" +
                "Weight=" + this.getWeight() +
                ", Cost=" + this.getCost() +
                ", blockChance=" + blockChance +
                "\n";
    }

    public Shield(int cost, int weight, int level, int attributeRequirementsStrength,
                  int attributeRequirementsAgility, int attributeRequirementsIntelligence,
                  double protectionLevel, int bonusHp, int blockChance) {
        super(cost, weight, level, attributeRequirementsStrength, attributeRequirementsAgility,
                attributeRequirementsIntelligence, protectionLevel, bonusHp);
        this.blockChance = blockChance;
    }

    public String getName(){
        return "Shield";
    }

    public int getBlockChance() {
        return blockChance;
    }

    public void setBlockChance(int blockChance) {
        this.blockChance = blockChance;
    }
}
