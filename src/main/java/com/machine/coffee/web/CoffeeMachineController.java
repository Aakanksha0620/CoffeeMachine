package com.machine.coffee.web;

import com.machine.coffee.model.CoffeeMachine;
import com.machine.coffee.model.Quantity;
import com.machine.coffee.model.QuantityBuilder;
import com.machine.coffee.service.CoffeeMachineService;
import com.machine.coffee.service.CoffeeMachineServiceImpl;

public class CoffeeMachineController {
	
	CoffeeMachine machine;
	
	private CoffeeMachineService coffeeMachineService;

	public CoffeeMachineController(int outlet, Quantity machineQuantity) {
		this.machine = CoffeeMachine.getCoffeeMachine(outlet, machineQuantity);
		this.coffeeMachineService = new CoffeeMachineServiceImpl();
	}
	
	
	public void getBeverage(String beverageType) {
		coffeeMachineService.getBeverage(beverageType);
	}

	public static void main(String[] args) {
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
