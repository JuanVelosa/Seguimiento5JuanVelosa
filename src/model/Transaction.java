package model;

import java.time.LocalDate;

public class Transaction {
	private double value;
	private String description;
	private Type type;
	private LocalDate date;
	
	public Transaction(double value, String description, Type type, LocalDate date) {
		this.value = value;
		this.description = description;
		this.type = type;
		this.date = date;
	}
	
	
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}
