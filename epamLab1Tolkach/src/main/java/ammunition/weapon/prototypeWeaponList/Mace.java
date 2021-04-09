package ammunition.weapon.prototypeWeaponList;

import ammunition.attackTypes.AttackTypes;
import ammunition.weapon.Weapon;

public class Mace extends Weapon {
    int chanceToSmashYourHead;

    public Mace(int cost, int weight, int level, int attributeRequirementsStrength,
                int attributeRequirementsAgility, int attributeRequirementsIntelligence,
                double damage, int attackSpeed, double criticalChance, int criticalDamage,
                AttackTypes type, int chanceToSmashYourHead) {
        super(cost, weight, level, attributeRequirementsStrength, attributeRequirementsAgility,
                attributeRequirementsIntelligence, damage, attackSpeed, criticalChance, criticalDamage, type);
        this.chanceToSmashYourHead = chanceToSmashYourHead;
    }

    @Override
    public String toString() {
        return "Mace:"+ "\n" +
                "Weight=" + this.getWeight() +
                ", Cost=" + this.getCost() +
                ", chanceToSmashYourHead=" + chanceToSmashYourHead +
                ", Level=" + this.getLevel() +
                ", AttackType=" + this.getType() +
                "\n";
    }

    public String getName(){
        return "Mace";
    }

    public int getChanceToSmashYourHead() {
        return chanceToSmashYourHead;
    }

    public void setChanceToSmashYourHead(int chanceToSmashYourHead) {
        this.chanceToSmashYourHead = chanceToSmashYourHead;
    }
}
