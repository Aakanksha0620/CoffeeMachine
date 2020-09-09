package com.machine.coffee.model;

import org.junit.jupiter.api.Test;

public class QuantityTest {
	
	@Test
	public void test() {
		int amount = 0;
		Object chngAmount = 1;
		Quantity quantity = new QuantityBuilder()
							.setHotMilk(amount)
							.setHotWater(amount)
							.setGingerSyrup(amount)
							.setGreenMixture(amount)
							.setTeaLeavesSyrup(amount)
							.setSugarSyrup(amount)
							.getBeverage();
		quantity.setHotWater(chngAmount);
		quantity.setHotMilk(chngAmount);
		quantity.setGreenMixture(chngAmount);
		quantity.setGingerSyrup(chngAmount);
		quantity.setTeaLeavesSyrup(chngAmount);
		quantity.setSugarSyrup(chngAmount);
	}

}
