import comparators.WeightComparator;
import filters.CostFilter;
import warrior.Warrior;
import ammunition.AmmunitionElement;
import ammunition.armor.prototypeArmorList.*;
import ammunition.attackTypes.AttackTypes;
import ammunition.jewerlies.prototypeJewerliesList.Earring;
import ammunition.jewerlies.prototypeJewerliesList.Necklace;
import ammunition.jewerlies.prototypeJewerliesList.Ring;
import ammunition.weapon.prototypeWeaponList.*;

import java.util.Random;

public class Main {

    public static AmmunitionElement[] ammunitionElements(int count) {
        AmmunitionElement[] ammunitionElements = new AmmunitionElement[count];
        count--;
        while (count != -1) {
            Random rand = new Random();
            switch (Math.abs(rand.nextInt(14))) {
                case 0: {
                    Boots boots = new Boots(
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            rand.nextDouble(),
                            rand.nextInt(2000),
                            rand.nextInt(100),
                            rand.nextBoolean()
                    );
                    ammunitionElements[count] = boots;
                    break;
                }
                case 1: {
                    Chest chest = new Chest(
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            rand.nextDouble(),
                            rand.nextInt(5000),
                            rand.nextInt(100)
                    );
                    ammunitionElements[count] = chest;
                    break;
                }
                case 2: {
                    Gloves gloves = new Gloves(
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            rand.nextDouble(),
                            rand.nextInt(1000),
                            rand.nextInt(5)
                    );
                    gloves.setConvenienceInFineMotorSkills(gloves.getProgConvenienceInFineMotorSkills());
                    ammunitionElements[count] = gloves;
                    break;
                }
                case 3: {
                    Helmet helmet = new Helmet(
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            rand.nextDouble(),
                            rand.nextInt(7000),
                            rand.nextInt(100),
                            rand.nextInt(3)
                    );
                    helmet.setInspirationLevel(helmet.getProgInspirationLevel());
                    ammunitionElements[count] = helmet;
                    break;
                }
                case 4: {
                    PairOfBags pairOfBags = new PairOfBags(
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            rand.nextInt(9000),
                            rand.nextInt(100),
                            rand.nextBoolean()
                    );
                    ammunitionElements[count] = pairOfBags;
                    break;
                }
                case 5: {
                    Shield shield = new Shield(
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            rand.nextInt(15000),
                            rand.nextInt(100),
                            rand.nextInt(100)
                    );
                    ammunitionElements[count] = shield;
                    break;
                }
                case 6: {
                    Earring earring = new Earring(
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            rand.nextInt(3000),
                            rand.nextInt(3),
                            rand.nextInt(10),
                            rand.nextInt(10)

                    );
                    ammunitionElements[count] = earring;
                    break;
                }
                case 7: {
                    Necklace necklace = new Necklace(
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            rand.nextInt(2000),
                            rand.nextInt(3),
                            rand.nextInt(50),
                            rand.nextInt(500),
                            rand.nextInt(3)
                    );
                    ammunitionElements[count] = necklace;
                    break;
                }
                case 8: {
                    Ring ring = new Ring(
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            rand.nextInt(7000),
                            rand.nextInt(3),
                            rand.nextInt(700),
                            rand.nextInt(400),
                            rand.nextInt(50)
                    );
                    ammunitionElements[count] = ring;
                    break;
                }
                case 9: {
                    Axe axe = new Axe(
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            rand.nextDouble() + 900,
                            rand.nextInt(100),
                            rand.nextDouble() + 30,
                            rand.nextInt(300),
                            AttackTypes.fireBorn,
                            rand.nextInt(10)
                    );
                    ammunitionElements[count] = axe;
                    break;
                }
                case 10: {
                    Bow bow = new Bow(
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            rand.nextDouble() + 400,
                            rand.nextInt(300),
                            rand.nextDouble() + 30,
                            rand.nextInt(300),
                            AttackTypes.bloodyOne,
                            rand.nextInt(20)
                    );
                    ammunitionElements[count] = bow;
                    break;
                }
                case 11: {
                    Knife knife = new Knife(
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            rand.nextDouble() + 400,
                            rand.nextInt(200),
                            rand.nextDouble() + 30,
                            rand.nextInt(200),
                            AttackTypes.bloodyOne,
                            rand.nextInt(5)
                    );
                    ammunitionElements[count] = knife;
                    break;
                }
                case 12: {
                    Mace mace = new Mace(
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            rand.nextDouble() + 400,
                            rand.nextInt(700),
                            rand.nextDouble() + 30,
                            rand.nextInt(700),
                            AttackTypes.fireBorn,
                            rand.nextInt(25)
                    );
                    ammunitionElements[count] = mace;
                    break;
                }
                case 13: {
                    Sword sword = new Sword(
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(100)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            Math.abs(rand.nextInt(20)),
                            rand.nextDouble() + 400,
                            rand.nextInt(1000),
                            rand.nextDouble() + 40,
                            rand.nextInt(1000),
                            AttackTypes.freezing,
                            rand.nextInt(2)
                    );
                    ammunitionElements[count] = sword;
                    break;
                }
            }
            count--;
        }
        return ammunitionElements;
    }

    public static Warrior warrior() {
        Random random = new Random();
        return new Warrior(
                Math.abs(random.nextInt(30) + 10),
                Math.abs(random.nextInt(30) + 10),
                Math.abs(random.nextInt(30) + 10),
                ammunitionElements(random.nextInt(5) + 3)
        );
    }

    public static void main(String[] args) {

        Random random = new Random();
        int min = Math.abs(random.nextInt(40));
        int max = random.nextInt(50) + 100;
        Warrior warrior = warrior();
        System.out.println(warrior.toString());
        System.out.println();
        System.out.println("After sort");
        warrior.sort(new WeightComparator());
        System.out.println(warrior.totalCost(warrior));
        AmmunitionElement[] ammunitionElements = new AmmunitionElement[warrior.getAmmunitionElements().length];
        int checker = warrior.find(ammunitionElements, new CostFilter(0, 100));
        for (int t = 0; t < checker; t++) {
            System.out.println(ammunitionElements[t].toString() + warrior.check(ammunitionElements[t], warrior));
        }
        int count = warrior.find(ammunitionElements, new CostFilter(min, max));
        System.out.println("\n\n" + "Elements in our cost range:");
        System.out.println("min=" + min + "; max=" + max);
        for (int i = 0; i < count; i++) {
            System.out.println(ammunitionElements[i].getName() + " cost " + ammunitionElements[i].getCost());
        }

    }

}