package ammunition.weapon.prototypeWeaponList;

import ammunition.attackTypes.AttackTypes;
import ammunition.weapon.Weapon;

public class Sword extends Weapon {
    int chanceToLetFlyInABattle;

    @Override
    public String toString() {
        return "Sword:"+ "\n" +
                "Weight=" + this.getWeight() +
                ", Cost=" + this.getCost() +
                ", chanceToLetFlyInABattle=" + chanceToLetFlyInABattle +
                ", Level=" + this.getLevel() +
                ", AttackType=" + this.getType() +
                "\n";
    }

    public String getName(){
        return "Sword";
    }

    public Sword(int cost, int weight, int level, int attributeRequirementsStrength,
                 int attributeRequirementsAgility, int attributeRequirementsIntelligence,
                 double damage, int attackSpeed, double criticalChance, int criticalDamage,
                 AttackTypes type, int chanceToLetFlyInABattle) {
        super(cost, weight, level, attributeRequirementsStrength, attributeRequirementsAgility,
                attributeRequirementsIntelligence, damage, attackSpeed, criticalChance, criticalDamage, type);
        this.chanceToLetFlyInABattle = chanceToLetFlyInABattle;
    }

    public int getChanceToLetFlyInABattle() {
        return chanceToLetFlyInABattle;
    }

    public void setChanceToLetFlyInABattle(int chanceToLetFlyInABattle) {
        this.chanceToLetFlyInABattle = chanceToLetFlyInABattle;
    }
}
