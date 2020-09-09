package com.machine.coffee.model;

public class QuantityBuilder {
	
	private Object hot_water;
	private Object hot_milk;
	private Object ginger_syrup;
	private Object sugar_syrup;
	private Object tea_leaves_syrup;
	private Object green_mixture;
	

	public QuantityBuilder setHotWater(int hot_water) {
		this.hot_water = hot_water;
		return this;
	}
	
	public QuantityBuilder setHotMilk(int hot_milk) {
		this.hot_milk = hot_milk;
		return this;
	}
	
	public QuantityBuilder setGingerSyrup(int ginger_syrup) {
		this.ginger_syrup = ginger_syrup;
		return this;
	}
	
	public QuantityBuilder setSugarSyrup(int sugar_syrup) {
		this.sugar_syrup = sugar_syrup;
		return this;
	}
	
	public QuantityBuilder setTeaLeavesSyrup(int tea_leaves_syrup) {
		this.tea_leaves_syrup = tea_leaves_syrup;
		return this;
	}
	
	public QuantityBuilder setGreenMixture(int green_mixture) {
		this.green_mixture = green_mixture;
		return this;
	}

	public Quantity getBeverage() {
		return new Quantity(hot_water, hot_milk, ginger_syrup, sugar_syrup, tea_leaves_syrup, green_mixture);
	}

}
