package ammunition.armor;

import ammunition.AmmunitionElement;

public class Armor extends AmmunitionElement {
    double protectionLevel;
    int bonusHp;

    public Armor(int cost, int weight, int level, int attributeRequirementsStrength,
                 int attributeRequirementsAgility, int attributeRequirementsIntelligence,
                 double protectionLevel, int bonusHp) {
        super(cost, weight, level, attributeRequirementsStrength,
                attributeRequirementsAgility, attributeRequirementsIntelligence);
        this.protectionLevel = protectionLevel;
        this.bonusHp = bonusHp;
    }

    public double getProtectionLevel() {
        return protectionLevel;
    }

    public void setProtectionLevel(double protectionLevel) {
        this.protectionLevel = protectionLevel;
    }

    public int getBonusHp() {
        return bonusHp;
    }

    public void setBonusHp(int bonusHp) {
        this.bonusHp = bonusHp;
    }
}
