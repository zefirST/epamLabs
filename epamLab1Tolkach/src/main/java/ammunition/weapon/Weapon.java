package ammunition.weapon;

import ammunition.AmmunitionElement;
import ammunition.attackTypes.AttackTypes;

public class Weapon extends AmmunitionElement {
    double damage;
    int attackSpeed;
    double criticalChance;
    int criticalDamage;
    AttackTypes type;

    @Override
    public String toString() {
        return "weapon{" +
                "damage=" + damage +
                ", attackSpeed=" + attackSpeed +
                ", criticalChance=" + criticalChance +
                ", criticalDamage=" + criticalDamage +
                ", type=" + type +
                '}';
    }

    public Weapon(int cost, int weight, int level, int attributeRequirementsStrength,
                  int attributeRequirementsAgility, int attributeRequirementsIntelligence,
                  double damage, int attackSpeed, double criticalChance, int criticalDamage, AttackTypes type) {
        super(cost, weight, level, attributeRequirementsStrength,
                attributeRequirementsAgility, attributeRequirementsIntelligence);
        this.damage = damage;
        this.attackSpeed = attackSpeed;
        this.criticalChance = criticalChance;
        this.criticalDamage = criticalDamage;
        this.type = type;
    }

    public AttackTypes getType() {
        return type;
    }

    public void setType(AttackTypes type) {
        this.type = type;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public double getCriticalChance() {
        return criticalChance;
    }

    public void setCriticalChance(double criticalChance) {
        this.criticalChance = criticalChance;
    }

    public int getCriticalDamage() {
        return criticalDamage;
    }

    public void setCriticalDamage(int criticalDamage) {
        this.criticalDamage = criticalDamage;
    }
}