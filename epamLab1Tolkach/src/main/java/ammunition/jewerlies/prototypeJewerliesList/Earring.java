package ammunition.jewerlies.prototypeJewerliesList;

import ammunition.jewerlies.Jewerlies;

public class Earring extends Jewerlies {
    int brutalityLevel;
    int intimidationLevel;

    public Earring(int cost, int weight, int level, int attributeRequirementsStrength,
                   int attributeRequirementsAgility, int attributeRequirementsIntelligence,
                   int bonusMana, int progSpirituallySound, int brutalityLevel, int intimidationLevel) {
        super(cost, weight, level, attributeRequirementsStrength, attributeRequirementsAgility,
                attributeRequirementsIntelligence, bonusMana, progSpirituallySound);
        this.brutalityLevel = brutalityLevel;
        this.intimidationLevel = intimidationLevel;
    }

    public int getBrutalityLevel() {
        return brutalityLevel;
    }

    @Override
    public String toString() {
        return "Earring:"+ "\n"+
                "Weight=" + this.getWeight() +
                ", Cost=" + this.getCost() +
                ", brutalityLevel=" + brutalityLevel +
                ", intimidationLevel=" + intimidationLevel +
                "\n";
    }

    public String getName(){
        return "Earring";
    }

    public void setBrutalityLevel(int brutalityLevel) {
        this.brutalityLevel = brutalityLevel;
    }

    public int getIntimidationLevel() {
        return intimidationLevel;
    }

    public void setIntimidationLevel(int intimidationLevel) {
        this.intimidationLevel = intimidationLevel;
    }
}
