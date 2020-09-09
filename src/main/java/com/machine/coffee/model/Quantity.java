package com.machine.coffee.model;

public class Quantity{

	private Object hotWater;
	private Object hotMilk;
	private Object gingerSyrup;
	private Object sugarSyrup;
	private Object teaLeavesSyrup;
	private Object greenMixture;
	
	public Quantity(Object hot_water, Object hot_milk, Object ginger_syrup, Object sugar_syrup, 
			Object tea_leaves_syrup, Object green_mixture) {
		this.hotWater = hot_water;
		this.hotMilk = hot_milk;
		this.gingerSyrup = ginger_syrup;
		this.sugarSyrup = sugar_syrup;
		this.teaLeavesSyrup = tea_leaves_syrup;
		this.greenMixture = green_mixture;
	}

	public Object getHotWater() {
		return hotWater;
	}

	public void setHotWater(Object hotWater) {
		this.hotWater = hotWater;
	}

	public Object getHotMilk() {
		return hotMilk;
	}

	public void setHotMilk(Object hotMilk) {
		this.hotMilk = hotMilk;
	}

	public Object getGingerSyrup() {
		return gingerSyrup;
	}

	public void setGingerSyrup(Object gingerSyrup) {
		this.gingerSyrup = gingerSyrup;
	}

	public Object getSugarSyrup() {
		return sugarSyrup;
	}

	public void setSugarSyrup(Object sugarSyrup) {
		this.sugarSyrup = sugarSyrup;
	}

	public Object getTeaLeavesSyrup() {
		return teaLeavesSyrup;
	}

	public void setTeaLeavesSyrup(Object teaLeavesSyrup) {
		this.teaLeavesSyrup = teaLeavesSyrup;
	}

	public Object getGreenMixture() {
		return greenMixture;
	}

	public void setGreenMixture(Object greenMixture) {
		this.greenMixture = greenMixture;
	}


}
