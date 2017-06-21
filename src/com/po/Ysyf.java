package com.po;

public class Ysyf  implements java.io.Serializable{
	private int yid;
	private String start;
	private String destination;
	private int cubic;
	private int ton;
	private float time;
	
	
	public Ysyf() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ysyf(int yid, String start, String destination, int cubic, int ton, float time) {
		super();
		this.yid = yid;
		this.start = start;
		this.destination = destination;
		this.cubic = cubic;
		this.ton = ton;
		this.time = time;
	}
	public Ysyf(String start, String destination, int cubic, int ton, float time) {
		super();
		this.start = start;
		this.destination = destination;
		this.cubic = cubic;
		this.ton = ton;
		this.time = time;
	}
	public int getYid() {
		return yid;
	}
	public void setYid(int yid) {
		this.yid = yid;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getCubic() {
		return cubic;
	}
	public void setCubic(int cubic) {
		this.cubic = cubic;
	}
	public int getTon() {
		return ton;
	}
	public void setTon(int ton) {
		this.ton = ton;
	}
	public float getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}
	

}
