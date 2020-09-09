package com.machine.coffee.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoffeeMachineTest {
	
	@Test
	public void test() {
		Quantity machineQuantity = new QuantityBuilder().getBeverage();
		CoffeeMachine machine = CoffeeMachine.getCoffeeMachine(5, machineQuantity);
		machine.setQuantity(machineQuantity);
		Assertions.assertEquals(machineQuantity, machine.getQuantity());
		Assertions.assertEquals(3, machine.getOutlets());
	}

}
