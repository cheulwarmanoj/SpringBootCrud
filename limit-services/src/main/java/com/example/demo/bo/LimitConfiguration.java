package com.example.demo.bo;

public class LimitConfiguration {

	private int maxium;
	private int minium;
	public int getMaxium() {
		return maxium;
	}
	public void setMaxium(int maxium) {
		this.maxium = maxium;
	}
	public int getMinium() {
		return minium;
	}
	public void setMinium(int minium) {
		this.minium = minium;
	}
	public LimitConfiguration(int maxium, int minium) {
		super();
		this.maxium = maxium;
		this.minium = minium;
	}
	
	
	
	
	
}
