package ammunition.weapon.prototypeWeaponList;

import ammunition.attackTypes.AttackTypes;
import ammunition.weapon.Weapon;

public class Knife extends Weapon {
    int chanceToDropItOut;

    public int getChanceToDropItOut() {
        return chanceToDropItOut;
    }

    @Override
    public String toString() {
        return "Knife:"+ "\n" +
                "Weight=" + this.getWeight() +
                ", Cost=" + this.getCost() +
                ", chanceToDropItOut=" + chanceToDropItOut +
                ", Level=" + this.getLevel() +
                ", AttackType=" + this.getType() +
                "\n";
    }

    public String getName(){
        return "Knife";
    }

    public Knife(int cost, int weight, int level, int attributeRequirementsStrength,
                 int attributeRequirementsAgility, int attributeRequirementsIntelligence,
                 double damage, int attackSpeed, double criticalChance, int criticalDamage,
                 AttackTypes type, int chanceToDropItOut) {
        super(cost, weight, level, attributeRequirementsStrength, attributeRequirementsAgility,
                attributeRequirementsIntelligence, damage, attackSpeed, criticalChance, criticalDamage, type);
        this.chanceToDropItOut = chanceToDropItOut;
    }

    public void setChanceToDropItOut(int chanceToDropItOut) {
        this.chanceToDropItOut = chanceToDropItOut;
    }
}
