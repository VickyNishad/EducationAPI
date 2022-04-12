package com.course.education.model;

import java.util.List;

public class Computers {

	private int categoryid;
	private String categoryName;
	private String title;
	private List<ListOfCourse> ComputerCourses;
	public Computers(int categoryid, String categoryName, String title, List<ListOfCourse> computerCourses) {
		super();
		this.categoryid = categoryid;
		this.categoryName = categoryName;
		this.title = title;
		ComputerCourses = computerCourses;
	}
	public Computers() {
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
	public List<ListOfCourse> getComputerCourses() {
		return ComputerCourses;
	}
	public void setComputerCourses(List<ListOfCourse> computerCourses) {
		ComputerCourses = computerCourses;
	}
	@Override
	public String toString() {
		return "Computers [categoryid=" + categoryid + ", categoryName=" + categoryName + ", title=" + title
				+ ", ComputerCourses=" + ComputerCourses + "]";
	}
	
}
