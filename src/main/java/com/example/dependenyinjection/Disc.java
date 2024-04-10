package com.example.dependenyinjection;

public class Disc extends Product {
	private int capacity;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Disc [capacity=" + capacity + "]";
	}

}
