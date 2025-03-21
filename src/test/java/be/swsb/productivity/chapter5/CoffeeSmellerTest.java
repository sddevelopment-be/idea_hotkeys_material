package be.swsb.productivity.chapter5;

import be.swsb.productivity.chapter5.beans.CoffeeBeans;
import be.swsb.productivity.chapter5.beans.MaragoBeans;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

class CoffeeSmellerTest implements WithAssertions {

	@Test
	void knownBeansAreRecognized() {
		var toTest = new CoffeeSmeller();

		var result = toTest.smell(new MaragoBeans());

		assertThat(result).isEqualTo("They all smell like coffee");
	}

	@Test
	void nonCoffeeSmellsAreDetected() {
		var toTest = new CoffeeSmeller();

		var result = toTest.smell(new CoffeeBeans() {
			@Override
			public String scent() {
				return "Sweaty";
			}
		});

		assertThat(result).contains("Ehmm, this bean doesn't smell like coffee at all...");
	}

}