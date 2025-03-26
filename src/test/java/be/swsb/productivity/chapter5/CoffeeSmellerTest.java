package be.swsb.productivity.chapter5;

import static org.junit.jupiter.api.Assertions.*;

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


}