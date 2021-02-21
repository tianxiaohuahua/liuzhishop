package com.lmonkey.entity;

public class LMONKEY_USER {
	private String user_ID;
	private String user_NAME ;
	private String user_PASSWORD;
	private String user_SEX ;
	private String user_BIRTHDAY ;
	private String user_IDENITY_CODE;
	private String user_EMAIL ;
	private String user_MOBEL ;
	private String user_ADDRESS ;
	private int user_STATUS ;
	public LMONKEY_USER(String user_ID, String user_NAME, String user_PASSWORD,
			String user_SEX, String user_BIRTHDAY, String user_IDENITY_CODE,
			String user_EMAIL, String user_MOBEL, String user_ADDRESS,
			int user_STATUS) {
		super();
		this.user_ID = user_ID;
		this.user_NAME = user_NAME;
		this.user_PASSWORD = user_PASSWORD;
		this.user_SEX = user_SEX;
		this.user_BIRTHDAY = user_BIRTHDAY;
		this.user_IDENITY_CODE = user_IDENITY_CODE;
		this.user_EMAIL = user_EMAIL;
		this.user_MOBEL = user_MOBEL;
		this.user_ADDRESS = user_ADDRESS;
		this.user_STATUS = user_STATUS;
	}
	public String getUser_ID() {
		return user_ID;
	}
	public void setUser_ID(String user_ID) {
		this.user_ID = user_ID;
	}
	public String getUser_NAME() {
		return user_NAME;
	}
	public void setUser_NAME(String user_NAME) {
		this.user_NAME = user_NAME;
	}
	public String getUser_PASSWORD() {
		return user_PASSWORD;
	}
	public void setUser_PASSWORD(String user_PASSWORD) {
		this.user_PASSWORD = user_PASSWORD;
	}
	public String getUser_SEX() {
		return user_SEX;
	}
	public void setUser_SEX(String user_SEX) {
		this.user_SEX = user_SEX;
	}
	public String getUser_BIRTHDAY() {
		return user_BIRTHDAY;
	}
	public void setUser_BIRTHDAY(String user_BIRTHDAY) {
		this.user_BIRTHDAY = user_BIRTHDAY;
	}
	public String getUser_IDENITY_CODE() {
		return user_IDENITY_CODE;
	}
	public void setUser_IDENITY_CODE(String user_IDENITY_CODE) {
		this.user_IDENITY_CODE = user_IDENITY_CODE;
	}
	public String getUser_EMAIL() {
		return user_EMAIL;
	}
	public void setUser_EMAIL(String user_EMAIL) {
		this.user_EMAIL = user_EMAIL;
	}
	public String getUser_MOBEL() {
		return user_MOBEL;
	}
	public void setUser_MOBEL(String user_MOBEL) {
		this.user_MOBEL = user_MOBEL;
	}
	public String getUser_ADDRESS() {
		return user_ADDRESS;
	}
	public void setUser_ADDRESS(String user_ADDRESS) {
		this.user_ADDRESS = user_ADDRESS;
	}
	public int getUser_STATUS() {
		return user_STATUS;
	}
	public void setUser_STATUS(int user_STATUS) {
		this.user_STATUS = user_STATUS;
	}
	
	
}
