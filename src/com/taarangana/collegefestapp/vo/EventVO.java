package com.taarangana.collegefestapp.vo;

public class EventVO {
	private String name;
	private int iconID;
	private String description;
	private String contact;
	private String rules;
	private String url;
	
	
	public String getRules() {
		return rules;
	}
	public void setRules(String rules) {
		this.rules = rules;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIconID() {
		return iconID;
	}
	public void setIconID(int iconID) {
		this.iconID = iconID;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
