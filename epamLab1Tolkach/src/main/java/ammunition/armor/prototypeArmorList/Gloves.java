package ammunition.armor.prototypeArmorList;

import ammunition.armor.Armor;

public class Gloves extends Armor {
    int progConvenienceInFineMotorSkills;
    String ConvenienceInFineMotorSkills;

    @Override
    public String toString() {
        return "Gloves:"+ "\n" +
                "Weight=" + this.getWeight() +
                ", Cost=" + this.getCost() +
                ", ConvenienceInFineMotorSkills='" + this.getConvenienceInFineMotorSkills() + '\'' +
                "\n";
    }

    public String getName(){
        return "Gloves";
    }

    public Gloves(int cost, int weight, int level, int attributeRequirementsStrength,
                  int attributeRequirementsAgility, int attributeRequirementsIntelligence,
                  double protectionLevel, int bonusHp, int progConvenienceInFineMotorSkills) {
        super(cost, weight, level, attributeRequirementsStrength, attributeRequirementsAgility,
                attributeRequirementsIntelligence, protectionLevel, bonusHp);
        this.progConvenienceInFineMotorSkills = progConvenienceInFineMotorSkills;
        this.setConvenienceInFineMotorSkills(this.progConvenienceInFineMotorSkills);
    }

    public int getProgConvenienceInFineMotorSkills() {
        return progConvenienceInFineMotorSkills;
    }

    public void setProgConvenienceInFineMotorSkills(int progConvenienceInFineMotorSkills) {
        this.progConvenienceInFineMotorSkills = progConvenienceInFineMotorSkills;
    }

    public String getConvenienceInFineMotorSkills() {
        return ConvenienceInFineMotorSkills;
    }

    public void setConvenienceInFineMotorSkills(int progConvenienceInFineMotorSkills) {
        switch (this.progConvenienceInFineMotorSkills) {
            case 1:
                ConvenienceInFineMotorSkills = "it's not meant to be";
                break;
            case 2:
                ConvenienceInFineMotorSkills = "you better workout boy";
                break;
            case 3:
                ConvenienceInFineMotorSkills = "let's see what you can";
                break;
            case 4:
                ConvenienceInFineMotorSkills = "You're a good one";
                break;
            case 5:
                ConvenienceInFineMotorSkills = "Superior";
                break;
        }
    }
}
