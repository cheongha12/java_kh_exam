package com.kh.practice.list.library.model.vo;

import java.util.Objects;

public class Book {
	private String title;
	private String author;
	private String category;
	private int price;
	public Book() {}
	public Book(String title,String author,String category,int price) {
		
	}

	public String toString() {
		return String.format(title, author, category,price);
		
	}
	public int hashcode() {
		return Objects.hash(title, author, category,price);
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
