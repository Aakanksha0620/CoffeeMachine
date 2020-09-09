package com.machine.coffee.service;

import com.machine.coffee.model.Beverage;
import com.machine.coffee.model.CoffeeMachine;

public class CoffeeMachineServiceImpl implements CoffeeMachineService {
	
	private static CoffeeMachine machine;
	
	Beverage beverage;
	
	public Beverage getBeverage() {
		return beverage;
	}

	public void setBeverage(Beverage beverage) {
		this.beverage = beverage;
	}

	private String getSuccessMsg() {
		return this.beverage.getBeverageType() + " is prepared.";
	}
	
	private String getUnavailableMsg() {
		return this.beverage.getBeverageType() + " cannot be prepared because "+ this.beverage.getIngredient() + " is not available.";
	}
	
	private String getInsufficientMsg() {
		return this.beverage.getBeverageType() + " cannot be prepared because "+ this.beverage.getIngredient() + " is not sufficient.";
	}
	
	public boolean checkUtil(int required, Object value) {
		if(value != null) {
			if((int)value >= required) {
				return true;
			}
			System.out.println(this.getInsufficientMsg());
			return false;
		}
		System.out.println(this.getUnavailableMsg());
		return false;
	}
	
	private boolean checkWater(int required) {
		this.beverage.setIngredient("Hot Water");
		Object obj =  machine.getQuantity().getHotWater();
		if(checkUtil(required, obj)) {
			machine.getQuantity().setHotWater((int)obj - required);
			return true;
		}
		return false;
	}
	
	private boolean checkMilk(int required) {
		this.beverage.setIngredient("Hot Milk");
		Object obj =  machine.getQuantity().getHotMilk();
		if(checkUtil(required, obj)) {
			machine.getQuantity().setHotMilk((int)obj - required);
			return true;
		}
		return false;
	}
	
	private boolean checkGingerSyrup(int required) {
		this.beverage.setIngredient("Ginger Syrup");
		Object obj =  machine.getQuantity().getGingerSyrup();
		if(checkUtil(required, obj)) {
			machine.getQuantity().setGingerSyrup((int)obj - required);
			return true;
		}
		return false;
	}
	
	private boolean checkSugarSyrup(int required) {
		this.beverage.setIngredient("Sugar Syrup");
		Object obj =  machine.getQuantity().getSugarSyrup();
		if(checkUtil(required, obj)) {
			machine.getQuantity().setSugarSyrup((int)obj - required);
			return true;
		}
		return false;
	}
	
	private boolean checkTeaLeavesSyrup(int required) {
		this.beverage.setIngredient("Tea Leaves Syrup");
		Object obj =  machine.getQuantity().getTeaLeavesSyrup();
		if(checkUtil(required, obj)) {
			machine.getQuantity().setTeaLeavesSyrup((int)obj - required);
			return true;
		}
		return false;
	}
	
	private boolean checkGreenMixture(int required) {
		this.beverage.setIngredient("Green Mixture");
		Object obj =  machine.getQuantity().getGreenMixture();
		if(checkUtil(required, obj)) {
			machine.getQuantity().setGreenMixture((int)obj - required);
			return true;
		}
		return false;
	}

	private void getHotTea() {
		if(checkWater(200) && checkMilk(100) && checkGingerSyrup(10) && checkSugarSyrup(10) && checkTeaLeavesSyrup(30)) {
			System.out.println(this.getSuccessMsg());
		}
	}
	
	private void getHotCoffee() {
		if(checkWater(100) && checkMilk(400) && checkGingerSyrup(30) && checkSugarSyrup(50) && checkTeaLeavesSyrup(30)) {
			System.out.println(this.getSuccessMsg());
		}
	}
	
	private void getBlackTea() {
		if(checkWater(300) && checkGingerSyrup(30) && checkSugarSyrup(50) && checkTeaLeavesSyrup(30)) {
			System.out.println(this.getSuccessMsg());
		}
	}
	
	private void getGreenTea() {
		if(checkWater(100) && checkGingerSyrup(30) && checkSugarSyrup(10) && checkGreenMixture(30)) {
			System.out.println(this.getSuccessMsg());
		}
	}
	
	
	@Override
	public void getBeverage(String bvrg) {
		machine = CoffeeMachine.getCoffeeMachine();
		CoffeeMachineServiceImpl serviceimpl = new CoffeeMachineServiceImpl();
		serviceimpl.setBeverage(new Beverage());
		serviceimpl.getBeverage().setBeverageType(bvrg);
		switch(bvrg) {
			case "Hot Tea":
				serviceimpl.getHotTea();
				break;
			case "Hot Coffee":
				serviceimpl.getHotCoffee();
				break;
			case "Black Tea":
				serviceimpl.getBlackTea();
				break;
			case "Green Tea":
				serviceimpl.getGreenTea();
				break;
			default:
				System.out.println("Unavailable");	
		}
	}

}
