package com.machine.coffee.web;

import org.junit.jupiter.api.Test;

import com.machine.coffee.model.Quantity;
import com.machine.coffee.model.QuantityBuilder;

public class CoffeeMachineControllerTest {
	
	@Test
	public void testGetBeverage() {
		Quantity machineQuantity = new QuantityBuilder()
				.setHotWater(500)
				.setHotMilk(500)
				.setGingerSyrup(100)
				.setSugarSyrup(100)
				.setTeaLeavesSyrup(100)
				.getBeverage();

		CoffeeMachineController cntl = new CoffeeMachineController(3, machineQuantity);
		cntl.getBeverage("Hot Tea");
		cntl.getBeverage("Hot Coffee");
		cntl.getBeverage("Green Tea");
		cntl.getBeverage("Black Tea");
	}

}
