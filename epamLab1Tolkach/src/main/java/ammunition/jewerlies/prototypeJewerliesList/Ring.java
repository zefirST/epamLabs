package ammunition.jewerlies.prototypeJewerliesList;

import ammunition.jewerlies.Jewerlies;

public class Ring extends Jewerlies {
    int bonusDamage;
    int bonusCriticalDamage;
    int bonusCriticalChance;

    @Override
    public String toString() {
        return "Ring:"+ "\n" +
                "Weight=" + this.getWeight() +
                ", Cost=" + this.getCost() +
                ", bonusDamage=" + bonusDamage +
                ", bonusCriticalDamage=" + bonusCriticalDamage +
                ", bonusCriticalChance=" + bonusCriticalChance +
                "\n";
    }

    public String getName(){
        return "Ring";
    }

    public Ring(int cost, int weight, int level, int attributeRequirementsStrength,
                int attributeRequirementsAgility, int attributeRequirementsIntelligence,
                int bonusMana, int progSpirituallySound, int bonusDamage,
                int bonusCriticalDamage, int bonusCriticalChance) {
        super(cost, weight, level, attributeRequirementsStrength, attributeRequirementsAgility,
                attributeRequirementsIntelligence, bonusMana, progSpirituallySound);
        this.bonusDamage = bonusDamage;
        this.bonusCriticalDamage = bonusCriticalDamage;
        this.bonusCriticalChance = bonusCriticalChance;
    }

    public int getBonusDamage() {
        return bonusDamage;
    }

    public void setBonusDamage(int bonusDamage) {
        this.bonusDamage = bonusDamage;
    }

    public int getBonusCriticalDamage() {
        return bonusCriticalDamage;
    }

    public void setBonusCriticalDamage(int bonusCriticalDamage) {
        this.bonusCriticalDamage = bonusCriticalDamage;
    }

    public int getBonusCriticalChance() {
        return bonusCriticalChance;
    }

    public void setBonusCriticalChance(int bonusCriticalChance) {
        this.bonusCriticalChance = bonusCriticalChance;
    }
}
