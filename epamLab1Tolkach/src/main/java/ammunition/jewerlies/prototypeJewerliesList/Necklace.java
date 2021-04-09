package ammunition.jewerlies.prototypeJewerliesList;

import ammunition.jewerlies.Jewerlies;

public class Necklace extends Jewerlies {
    int bonusCriticalChance;
    int bonusCriticalDamage;
    int progMoraleLevel;
    String moraleLevel;

    @Override
    public String toString() {
        return "Necklace:" + "\n" +
                "Weight=" + this.getWeight() +
                ", Cost=" + this.getCost() +
                ", bonusCriticalChance=" + bonusCriticalChance +
                ", bonusCriticalDamage=" + bonusCriticalDamage +
                ", moraleLevel=" + moraleLevel +
                "\n";
    }

    public String getName() {
        return "Necklace";
    }

    public Necklace(int cost, int weight, int level, int attributeRequirementsStrength,
                    int attributeRequirementsAgility, int attributeRequirementsIntelligence,
                    int bonusMana, int progSpirituallySound, int bonusCriticalChance, int bonusCriticalDamage,
                    int progMoraleLevel) {
        super(cost, weight, level, attributeRequirementsStrength, attributeRequirementsAgility,
                attributeRequirementsIntelligence, bonusMana, progSpirituallySound);
        this.bonusCriticalChance = bonusCriticalChance;
        this.bonusCriticalDamage = bonusCriticalDamage;
        this.progMoraleLevel = progMoraleLevel;
        this.setMoraleLevel(this.progMoraleLevel);
    }

    public int getBonusCriticalChance() {
        return bonusCriticalChance;
    }

    public void setBonusCriticalChance(int bonusCriticalChance) {
        this.bonusCriticalChance = bonusCriticalChance;
    }

    public int getBonusCriticalDamage() {
        return bonusCriticalDamage;
    }

    public void setBonusCriticalDamage(int bonusCriticalDamage) {
        this.bonusCriticalDamage = bonusCriticalDamage;
    }

    public int getProgMoraleLevel() {
        return progMoraleLevel;
    }

    public void setProgMoraleLevel(int progMoraleLevel) {
        this.progMoraleLevel = progMoraleLevel;
    }

    public String getMoraleLevel() {
        return moraleLevel;
    }

    public void setMoraleLevel(int progMoraleLevel) {
        if (progMoraleLevel == 1)
            moraleLevel = "Low";
        else if (progMoraleLevel == 2)
            moraleLevel = "Medium";
        else
            moraleLevel = "High";
    }
}
