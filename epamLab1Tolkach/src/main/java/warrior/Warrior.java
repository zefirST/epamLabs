package warrior;

import ammunition.AmmunitionElement;
import interfaces.Filter;
import interfaces.Wear;

import java.util.Arrays;
import java.util.Comparator;


public class Warrior extends Man implements Wear {
    int strength;
    int agility;
    int intelligence;
    private AmmunitionElement[] ammunitionElements;

    public Warrior(int strength, int agility, int intelligence, AmmunitionElement[] ammunitionElements) {
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.ammunitionElements = ammunitionElements;
    }

    public AmmunitionElement[] getAmmunitionElements() {
        return ammunitionElements;
    }

    public void setAmmunitionElements(AmmunitionElement[] ammunitionElements) {
        this.ammunitionElements = ammunitionElements;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void sort(Comparator<AmmunitionElement> comparator) {
        Arrays.sort(getAmmunitionElements(), comparator);
    }

    public int find(AmmunitionElement[] ammunitionElements, Filter filter) {
        int index = 0;
        for (AmmunitionElement ammunitionElement : getAmmunitionElements()) {
            if (filter.check(ammunitionElement)) {
                ammunitionElements[index] = ammunitionElement;
                index++;
            }
        }
        return index;
    }

    @Override
    public String check(AmmunitionElement ammunitionElement, Warrior warrior) {
        String s1 = "You can wear it.";
        String s2 = "";
            if (ammunitionElement.getAttributeRequirementsStrength() > this.strength){
                s2 = "You can't wear . Need more Strength! Needed:" + ammunitionElement.getAttributeRequirementsStrength()+
                        ". Your=" +warrior.strength + "\n";
            }
            else if (ammunitionElement.getAttributeRequirementsAgility() > this.agility){
                s2 = s2 + "You can't wear this. Need more Agility! Needed:" + ammunitionElement.getAttributeRequirementsAgility()+
                        ". Your=" +warrior.agility + "\n" ;
            }
            else if (ammunitionElement.getAttributeRequirementsIntelligence() > this.intelligence){
                s2 = s2 + "You can't wear this. Need more Intelligence! Needed:" + ammunitionElement.getAttributeRequirementsIntelligence()+
                        ". Your=" +warrior.intelligence + "\n" ;
            }
            if(s1.length()>s2.length())
                return s1;
            else
                return s2;
    }

    public String totalCost(Warrior warrior) {
        int totalCost = 0;
        for (int i = 0; i < warrior.ammunitionElements.length; ++i) {
            totalCost += ammunitionElements[i].getCost();
        }
        return "TotalCost=" + totalCost;
    }

    @Override
    public String toString() {
        return "Warrior:" + "\n" +
                "strength=" + strength +
                ", agility=" + agility +
                ", intelligence=" + intelligence + "\n" +
                "ammunitionElements:" + "\n" + Arrays.toString(ammunitionElements);
    }
}
