package ammunition.armor.prototypeArmorList;

import ammunition.armor.Armor;

public class Boots extends Armor {
    int bonusMovementSpeed;
    boolean tightOrNot;

    public String convenience() {
        if (tightOrNot == false)
            return "Good luck)";
        else
            return "You won't get far!";
    }

    @Override
    public String toString() {
        return "Boots:"+ "\n" +
                "Weight=" + this.getWeight() +
                ", Cost=" + this.getCost() +
                ", bonusMovementSpeed = " + bonusMovementSpeed +
                ", tightOrNot = " + this.convenience() +
                "\n";
    }

    public Boots(int cost, int weight, int level, int attributeRequirementsStrength,
                 int attributeRequirementsAgility, int attributeRequirementsIntelligence,
                 double protectionLevel, int bonusHp, int bonusMovementSpeed, boolean tightOrNot) {
        super(cost, weight, level, attributeRequirementsStrength, attributeRequirementsAgility,
                attributeRequirementsIntelligence, protectionLevel, bonusHp);
        this.bonusMovementSpeed = bonusMovementSpeed;
        this.tightOrNot = tightOrNot;
    }

    public String getName(){
        return "Boots";
    }

    public int getBonusMovementSpeed() {
        return bonusMovementSpeed;
    }

    public void setBonusMovementSpeed(int bonusMovementSpeed) {
        this.bonusMovementSpeed = bonusMovementSpeed;
    }

    public boolean isTightOrNot() {
        return tightOrNot;
    }

    public void setTightOrNot(boolean tightOrNot) {
        this.tightOrNot = tightOrNot;
    }
}
