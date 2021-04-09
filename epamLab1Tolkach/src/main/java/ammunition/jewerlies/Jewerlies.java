package ammunition.jewerlies;

import ammunition.AmmunitionElement;

public class Jewerlies extends AmmunitionElement {
    int bonusMana;
    int progSpirituallySound;
    String spirituallySound;

    public Jewerlies(int cost, int weight, int level, int attributeRequirementsStrength,
                     int attributeRequirementsAgility, int attributeRequirementsIntelligence,
                     int bonusMana, int progSpirituallySound) {
        super(cost, weight, level, attributeRequirementsStrength,
                attributeRequirementsAgility, attributeRequirementsIntelligence);
        this.bonusMana = bonusMana;
        this.progSpirituallySound = progSpirituallySound;
        this.setSpirituallySound(this.progSpirituallySound);
    }

    public int getBonusMana() {
        return bonusMana;
    }

    public void setBonusMana(int bonusMana) {
        this.bonusMana = bonusMana;
    }

    public int getProgSpirituallySound() {
        return progSpirituallySound;
    }

    public void setProgSpirituallySound(int progSpirituallySound) {
        this.progSpirituallySound = progSpirituallySound;
    }

    public String getSpirituallySound() {
        return spirituallySound;
    }

    public void setSpirituallySound(int progSpirituallySound) {
        if (progSpirituallySound == 3)
            this.spirituallySound = "High";
        else if (progSpirituallySound == 2)
            this.spirituallySound = "Medium";
        else
            this.spirituallySound = "Low";
    }
}
