package com.webapp3rdyear.enity;

public class Voucher {
	private int vid; 
    private String des;
    private int discount;
    private int price; 
    private int quantity; 
    private String mfg;
    private String exp;
    
	public Voucher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Voucher(int vid, String des, int discount, int price, int quantity, String mfg, String exp) {
		super();
		this.vid = vid;
		this.des = des;
		this.discount = discount;
		this.price = price;
		this.quantity = quantity;
		this.mfg = mfg;
		this.exp = exp;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getMfg() {
		return mfg;
	}

	public void setMfg(String mfg) {
		this.mfg = mfg;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "Voucher [vid=" + vid + ", des=" + des + ", discount=" + discount + ", price=" + price + ", quantity="
				+ quantity + ", mfg=" + mfg + ", exp=" + exp + "]";
	}
	
	
	
    
}
