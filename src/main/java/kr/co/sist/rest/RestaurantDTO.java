package kr.co.sist.rest;

import java.sql.Date;

public class RestaurantDTO {
	
	private int rest_num;
	private String id, rest_name, menu, info;
	private double lat, lng;
	private Date input_date;
	
	public RestaurantDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RestaurantDTO(int rest_num, String id, String rest_name, String menu, String info, double lat, double lng,
			Date input_date) {
		super();
		this.rest_num = rest_num;
		this.id = id;
		this.rest_name = rest_name;
		this.menu = menu;
		this.info = info;
		this.lat = lat;
		this.lng = lng;
		this.input_date = input_date;
	}

	public int getRest_num() {
		return rest_num;
	}

	public void setRest_num(int rest_num) {
		this.rest_num = rest_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRest_name() {
		return rest_name;
	}

	public void setRest_name(String rest_name) {
		this.rest_name = rest_name;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public Date getInput_date() {
		return input_date;
	}

	public void setInput_date(Date input_date) {
		this.input_date = input_date;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
	
}
