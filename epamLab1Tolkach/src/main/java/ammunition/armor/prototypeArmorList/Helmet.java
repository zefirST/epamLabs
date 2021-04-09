package ammunition.armor.prototypeArmorList;

import ammunition.armor.Armor;

public class Helmet extends Armor {
    int chanceToBlockWithHead;
    String inspirationLevel;
    int progInspirationLevel;

    @Override
    public String toString() {
        return "Helmet:"+ "\n" +
                "Weight=" + this.getWeight() +
                ", Cost=" + this.getCost() +
                ", chanceToBlockWithHead=" + chanceToBlockWithHead +
                ", inspirationLevel='" + inspirationLevel + '\'' +
                "\n";
    }


    public String getName(){
        return "Helmet";
    }

    public Helmet(int cost, int weight, int level, int attributeRequirementsStrength,
                  int attributeRequirementsAgility, int attributeRequirementsIntelligence,
                  double protectionLevel, int bonusHp, int chanceToBlockWithHead, int progInspirationLevel) {
        super(cost, weight, level, attributeRequirementsStrength, attributeRequirementsAgility,
                attributeRequirementsIntelligence, protectionLevel, bonusHp);
        this.chanceToBlockWithHead = chanceToBlockWithHead;
        this.progInspirationLevel = progInspirationLevel;
        this.setInspirationLevel(this.progInspirationLevel);
    }

    public int getChanceToBlockWithHead() {
        return chanceToBlockWithHead;
    }

    public void setChanceToBlockWithHead(int chanceToBlockWithHead) {
        this.chanceToBlockWithHead = chanceToBlockWithHead;
    }

    public String getInspirationLevel() {
        return inspirationLevel;
    }

    public void setInspirationLevel(int progInspirationLevel) {
        if (progInspirationLevel == 3)
            this.inspirationLevel = "High";
        else if (progInspirationLevel == 2)
            this.inspirationLevel = "Medium";
        else
            this.inspirationLevel = "Low";
    }

    public int getProgInspirationLevel() {
        return progInspirationLevel;
    }

    public void setProgInspirationLevel(int progInspirationLevel) {
        this.progInspirationLevel = progInspirationLevel;
    }
}
