package ammunition.weapon.prototypeWeaponList;

import ammunition.attackTypes.AttackTypes;
import ammunition.weapon.Weapon;

public class Axe extends Weapon {
    int chanceToChoppedItUp;

    @Override
    public String toString() {
        return "Axe:"+ "\n" +
                "Weight=" + this.getWeight() +
                ", Cost=" + this.getCost() +
                ", chanceToChoppedItUp=" + chanceToChoppedItUp +
                ", Level=" + this.getLevel() +
                ", AttackType=" + this.getType() +
                "\n";
    }

    public String getName(){
        return "Axe";
    }

    public Axe(int cost, int weight, int level, int attributeRequirementsStrength,
               int attributeRequirementsAgility, int attributeRequirementsIntelligence,
               double damage, int attackSpeed, double criticalChance, int criticalDamage,
               AttackTypes type, int chanceToChoppedItUp) {
        super(cost, weight, level, attributeRequirementsStrength, attributeRequirementsAgility,
                attributeRequirementsIntelligence, damage, attackSpeed, criticalChance, criticalDamage, type);
        this.chanceToChoppedItUp = chanceToChoppedItUp;
    }

    public int getChanceToChoppedItUp() {
        return chanceToChoppedItUp;
    }

    public void setChanceToChoppedItUp(int chanceToChoppedItUp) {
        this.chanceToChoppedItUp = chanceToChoppedItUp;
    }
}
