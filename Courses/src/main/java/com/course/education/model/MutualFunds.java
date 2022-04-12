package com.course.education.model;

import java.util.List;

public class MutualFunds {

	private int categoryid;
	private String categoryName;
	private String title;
	private List<ListOfCourse> MutualFundsCourses;
	public MutualFunds(int categoryid, String categoryName, String title, List<ListOfCourse> mutualFundsCourses) {
		super();
		this.categoryid = categoryid;
		this.categoryName = categoryName;
		this.title = title;
		MutualFundsCourses = mutualFundsCourses;
	}
	public MutualFunds() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<ListOfCourse> getMutualFundsCourses() {
		return MutualFundsCourses;
	}
	public void setMutualFundsCourses(List<ListOfCourse> mutualFundsCourses) {
		MutualFundsCourses = mutualFundsCourses;
	}
	@Override
	public String toString() {
		return "MutualFunds [categoryid=" + categoryid + ", categoryName=" + categoryName + ", title=" + title
				+ ", MutualFundsCourses=" + MutualFundsCourses + "]";
	}
	
}
