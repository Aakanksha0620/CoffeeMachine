package com.machine.coffee.web;

import org.junit.jupiter.api.Test;

import com.machine.coffee.model.Quantity;
import com.machine.coffee.model.QuantityBuilder;

public class CoffeeMachineControllerTest {
	
	CoffeeMachineController cntl;
	
	@Test
	public void testGetBeverage() {
		Quantity machineQuantity = new QuantityBuilder()
				.setHotWater(500)
				.setHotMilk(500)
				.setGingerSyrup(100)
				.setSugarSyrup(100)
				.setTeaLeavesSyrup(100)
				.getBeverage();

		cntl = new CoffeeMachineController(3, machineQuantity);
		cntl.getBeverage("Hot Tea");
		cntl.getBeverage("Hot Coffee");
		cntl.getBeverage("Green Tea");
		cntl.getBeverage("Black Tea");
	}
	
	@Test
	public void testGetBeverage1() {
		Quantity machineQuantity = new QuantityBuilder()
				.setHotWater(500)
				.setGreenMixture(500)
				.setGingerSyrup(100)
				.setSugarSyrup(100)
				.setTeaLeavesSyrup(100)
				.getBeverage();
		cntl = new CoffeeMachineController(3, machineQuantity);
		cntl.machine.setQuantity(machineQuantity);
		cntl.getBeverage("Green Tea");
		cntl.getBeverage("Black Tea");
	}
	
	@Test
	public void testGetBeverage2() {
		Quantity machineQuantity = new QuantityBuilder()
				.setHotWater(500)
				.setGreenMixture(500)
				.setGingerSyrup(100)
				.setSugarSyrup(100)
				.setTeaLeavesSyrup(100)
				.getBeverage();
		cntl = new CoffeeMachineController(3, machineQuantity);
		cntl.machine.setQuantity(machineQuantity);
		cntl.getBeverage("Hot Tea");
		cntl.getBeverage("Cold Tea");
	}
	
	@Test
	public void testGetBeverage3() {
		Quantity machineQuantity = new QuantityBuilder()
				.setHotWater(500)
				.setHotMilk(500)
				.setGingerSyrup(100)
				.setSugarSyrup(100)
				.setTeaLeavesSyrup(100)
				.getBeverage();
		cntl = new CoffeeMachineController(3, machineQuantity);
		cntl.machine.setQuantity(machineQuantity);
		cntl.getBeverage("Hot Tea");
		cntl.getBeverage("Cold Tea");
	}
	
	@Test
	public void testGetBeverage4() {
		Quantity machineQuantity = new QuantityBuilder()
				.setHotWater(500)
				.setHotMilk(500)
				.setSugarSyrup(100)
				.setTeaLeavesSyrup(100)
				.getBeverage();
		cntl = new CoffeeMachineController(3, machineQuantity);
		cntl.machine.setQuantity(machineQuantity);
		cntl.getBeverage("Hot Tea");
		cntl.getBeverage("Cold Tea");
	}
	
	@Test
	public void testGetBeverage5() {
		Quantity machineQuantity = new QuantityBuilder()
				.setHotWater(500)
				.setHotMilk(500)
				.setGingerSyrup(100)
				.setTeaLeavesSyrup(100)
				.getBeverage();
		cntl = new CoffeeMachineController(3, machineQuantity);
		cntl.machine.setQuantity(machineQuantity);
		cntl.getBeverage("Hot Tea");
		cntl.getBeverage("Cold Tea");
	}
	
	
	@Test
	public void testGetBeverage6() {
		Quantity machineQuantity = new QuantityBuilder()
				.setHotWater(500)
				.setHotMilk(500)
				.setGingerSyrup(100)
				.setSugarSyrup(100)
				.getBeverage();
		cntl = new CoffeeMachineController(3, machineQuantity);
		cntl.machine.setQuantity(machineQuantity);
		cntl.getBeverage("Hot Tea");
		cntl.getBeverage("Cold Tea");
	}


}
