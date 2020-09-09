package com.machine.coffee.model;

public class CoffeeMachine {
	
	private static CoffeeMachine machine;
	
	private int outlets;
	
	private Quantity machineQuantity;
	
	private CoffeeMachine(int outlets, Quantity machineQuantity) {
		this.outlets = outlets;
		this.machineQuantity = machineQuantity;
	}
	
	public int getOutlets() {
		return this.outlets;
	}
	
	public Quantity getQuantity() {
		return this.machineQuantity;
	}
	
	public void setQuantity(Quantity quantity) {
		this.machineQuantity = quantity;
	}
	
	public static CoffeeMachine getCoffeeMachine(int outlets, Quantity machineQuantity) {
		if(machine == null) {
			machine = new CoffeeMachine(outlets, machineQuantity);
		}
		return machine;
	}
	
	public static CoffeeMachine getCoffeeMachine() {
		return machine;
	}


}
