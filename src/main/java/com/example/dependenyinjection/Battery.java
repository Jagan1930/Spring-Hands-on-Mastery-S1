package com.example.dependenyinjection;

public class Battery extends Product {
	private boolean rechargable;

	public boolean isRechargable() {
		return rechargable;
	}

	public void setRechargable(boolean rechargable) {
		this.rechargable = rechargable;
	}

	@Override
	public String toString() {
		return "Battery [rechargable=" + rechargable + "]";
	}

}
