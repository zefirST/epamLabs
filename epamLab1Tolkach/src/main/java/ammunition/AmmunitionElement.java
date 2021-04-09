package ammunition;

public class AmmunitionElement {
    String name;
    int cost;
    int weight;
    int level;

    int attributeRequirementsStrength;
    int attributeRequirementsAgility;
    int attributeRequirementsIntelligence;

    public int getAttributeRequirementsStrength() {
        return attributeRequirementsStrength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAttributeRequirementsStrength(int attributeRequirementsStrength) {
        this.attributeRequirementsStrength = attributeRequirementsStrength;
    }

    public int getAttributeRequirementsAgility() {
        return attributeRequirementsAgility;
    }
    public AmmunitionElement(){}

    public AmmunitionElement(int cost, int weight, int level, int attributeRequirementsStrength,
                             int attributeRequirementsAgility, int attributeRequirementsIntelligence) {
        this.cost = cost;
        this.weight = weight;
        this.level = level;
        this.attributeRequirementsStrength = attributeRequirementsStrength;
        this.attributeRequirementsAgility = attributeRequirementsAgility;
        this.attributeRequirementsIntelligence = attributeRequirementsIntelligence;
    }


    @Override
    public String toString() {
        return "AmmunitionElement{" +
                "cost=" + cost +
                ", weight=" + weight +
                ", level=" + level +
                ", attributeRequirementsStrength=" + attributeRequirementsStrength +
                ", attributeRequirementsAgility=" + attributeRequirementsAgility +
                ", attributeRequirementsIntelligence=" + attributeRequirementsIntelligence +
                '}' + "\n";
    }

    public void setAttributeRequirementsAgility(int attributeRequirementsAgility) {
        this.attributeRequirementsAgility = attributeRequirementsAgility;
    }

    public int getAttributeRequirementsIntelligence() {
        return attributeRequirementsIntelligence;
    }

    public void setAttributeRequirementsIntelligence(int attributeRequirementsIntelligence) {
        this.attributeRequirementsIntelligence = attributeRequirementsIntelligence;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
