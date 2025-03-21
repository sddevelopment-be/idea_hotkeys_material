package be.swsb.productivity.chapter5;

import java.util.List;

import be.swsb.productivity.chapter5.beans.CoffeeBeans;

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
        return List.of("marago", "yrgacheffe", "sidamo").contains(scent);
    }
}
