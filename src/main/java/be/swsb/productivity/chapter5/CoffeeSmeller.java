package be.swsb.productivity.chapter5;

import be.swsb.productivity.chapter5.beans.CoffeeBeans;

import static com.google.common.collect.Lists.newArrayList;
import static java.lang.String.format;
import static java.util.Arrays.asList;

public class CoffeeSmeller {
    public String smell(CoffeeBeans... beans) {
        for (CoffeeBeans bean : beans) {
            if (!smellsLikeCoffee(bean.scent())) {
                return String.format("Ehmm, this bean doesn't smell like coffee at all... What's up with %s?", bean.toString());
            }
        }
        return "They all smell like coffee";
    }

    private boolean smellsLikeTeenSpirit(String scent) {
        return false;
    }

    private boolean smellsLikeCoffee(String scent) {
        return newArrayList("marago", "yrgacheffe", "sidamo").contains(scent);
    }
}
