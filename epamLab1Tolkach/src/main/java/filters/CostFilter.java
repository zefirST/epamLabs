package filters;

import ammunition.AmmunitionElement;
import interfaces.Filter;

public class CostFilter implements Filter {


    private double minCost;
    private double maxCost;


    public CostFilter(int minCost, int maxCost) {
        this.minCost = minCost;
        this.maxCost = maxCost;
    }


    public double getMinCost() {
        return minCost;
    }

    public double getMaxCost() {
        return maxCost;
    }


    public void setMinFuelConsumption(int minCost) {
        this.minCost = minCost;
    }

    public void setMaxFuelConsumption(int maxCost) {
        this.maxCost = maxCost;
    }

    @Override
    public boolean check(AmmunitionElement ammunitionElement) {
        return (minCost <= ammunitionElement.getCost()) && (ammunitionElement.getCost()
                <= maxCost);
    }


    @Override
    public String toString() {
        return "CostFilter{" +
                "minCost=" + minCost +
                ", maxCost=" + maxCost +
                '}';
    }
}
