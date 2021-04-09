package ammunition.weapon.prototypeWeaponList;

import ammunition.attackTypes.AttackTypes;
import ammunition.weapon.Weapon;

public class Bow extends Weapon {
    int chanceToShootThroughAKneeCap;

    @Override
    public String toString() {
        return "Bow:"+ "\n"+
                "Weight=" + this.getWeight() +
                ", Cost=" + this.getCost() +
                ", chanceToShootThroughAKneeCap=" + chanceToShootThroughAKneeCap +
                ", Level=" + this.getLevel() +
                ", AttackType=" + this.getType() +
                "\n";
    }

    public String getName(){
        return "Bow";
    }

    public Bow(int cost, int weight, int level, int attributeRequirementsStrength,
               int attributeRequirementsAgility, int attributeRequirementsIntelligence,
               double damage, int attackSpeed, double criticalChance, int criticalDamage,
               AttackTypes type, int chanceToShootThroughAKneeCap) {
        super(cost, weight, level, attributeRequirementsStrength, attributeRequirementsAgility,
                attributeRequirementsIntelligence, damage, attackSpeed, criticalChance, criticalDamage, type);
        this.chanceToShootThroughAKneeCap = chanceToShootThroughAKneeCap;
    }

    public int getChanceToShootThroughAKneeCap() {
        return chanceToShootThroughAKneeCap;
    }

    public void setChanceToShootThroughAKneeCap(int chanceToShootThroughAKneeCap) {
        this.chanceToShootThroughAKneeCap = chanceToShootThroughAKneeCap;
    }
}
