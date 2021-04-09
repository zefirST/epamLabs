package comparators;

import ammunition.AmmunitionElement;

import java.util.Comparator;

public class WeightComparator implements Comparator<AmmunitionElement> {
    @Override
    public int compare(AmmunitionElement o1, AmmunitionElement o2) {
        return (int) (o1.getWeight() - o2.getWeight());
    }
}
