package com.kh.practice.snack.model.vo;

public class Snack {
	
	private String kind;
	private String name;
	private String flavor;
	private String numOf;
	private int price;
	
	public Snack() {
		
	}
	public Snack(String kind,String name, String flavor,String numOf,int price) {
		
		this.kind = kind;
		this.name = name;
		this.flavor =flavor;
		this.numOf = numOf;
		this.price =price;
				
		
	}

	public String information() {
		
		return null;
		//to do
		
	}
	
	
}
