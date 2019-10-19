package com.mega.mvc39;

public class StockDTO {

	// 필드명
	private String code;
	private String name;
	private String stockValue;
	private String closingValue;
	private String highValue;
	
	// getter & setter
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStockValue() {
		return stockValue;
	}
	public void setStockValue(String stockValue) {
		this.stockValue = stockValue;
	}
	public String getClosingValue() {
		return closingValue;
	}
	public void setClosingValue(String closingValue) {
		this.closingValue = closingValue;
	}
	public String getHighValue() {
		return highValue;
	}
	public void setHighValue(String highValue) {
		this.highValue = highValue;
	}
	
}
