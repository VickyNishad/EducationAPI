package com.course.education.model;

import java.util.List;

public class ListOfCourse {
	
	private String icon;
	private int id;
	private String fullname;
	private String displayname;
	private String shortname;
	private String author_name;
	private double price;
	private int rating;
	private String course_validity;
	private String video_link;
//	private List<CourseContent> contents;
	private Root root;
	private String mode;
	private int topic;
	private String section;
	private String total_lecturs;
	private String course_description;
	private String requirments;
	private String feedbackString;
	private String level;
	private String total_time;
	private String start_course_date;
	private String status;
	private int rate_your_experience;
	public ListOfCourse(String icon, int id, String fullname, String displayname, String shortname, String author_name,
			double price, int rating, String course_validity, String video_link, Root root, String mode, int topic,
			String section, String total_lecturs, String course_description, String requirments, String feedbackString,
			String level, String total_time, String start_course_date, String status, int rate_your_experience) {
		super();
		this.icon = icon;
		this.id = id;
		this.fullname = fullname;
		this.displayname = displayname;
		this.shortname = shortname;
		this.author_name = author_name;
		this.price = price;
		this.rating = rating;
		this.course_validity = course_validity;
		this.video_link = video_link;
		this.root = root;
		this.mode = mode;
		this.topic = topic;
		this.section = section;
		this.total_lecturs = total_lecturs;
		this.course_description = course_description;
		this.requirments = requirments;
		this.feedbackString = feedbackString;
		this.level = level;
		this.total_time = total_time;
		this.start_course_date = start_course_date;
		this.status = status;
		this.rate_your_experience = rate_your_experience;
	}
	public ListOfCourse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getDisplayname() {
		return displayname;
	}
	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}
	public String getShortname() {
		return shortname;
	}
	public void setShortname(String shortname) {
		this.shortname = shortname;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getCourse_validity() {
		return course_validity;
	}
	public void setCourse_validity(String course_validity) {
		this.course_validity = course_validity;
	}
	public String getVideo_link() {
		return video_link;
	}
	public void setVideo_link(String video_link) {
		this.video_link = video_link;
	}
	public Root getRoot() {
		return root;
	}
	public void setRoot(Root root) {
		this.root = root;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public int getTopic() {
		return topic;
	}
	public void setTopic(int topic) {
		this.topic = topic;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getTotal_lecturs() {
		return total_lecturs;
	}
	public void setTotal_lecturs(String total_lecturs) {
		this.total_lecturs = total_lecturs;
	}
	public String getCourse_description() {
		return course_description;
	}
	public void setCourse_description(String course_description) {
		this.course_description = course_description;
	}
	public String getRequirments() {
		return requirments;
	}
	public void setRequirments(String requirments) {
		this.requirments = requirments;
	}
	public String getFeedbackString() {
		return feedbackString;
	}
	public void setFeedbackString(String feedbackString) {
		this.feedbackString = feedbackString;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getTotal_time() {
		return total_time;
	}
	public void setTotal_time(String total_time) {
		this.total_time = total_time;
	}
	public String getStart_course_date() {
		return start_course_date;
	}
	public void setStart_course_date(String start_course_date) {
		this.start_course_date = start_course_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getRate_your_experience() {
		return rate_your_experience;
	}
	public void setRate_your_experience(int rate_your_experience) {
		this.rate_your_experience = rate_your_experience;
	}
	@Override
	public String toString() {
		return "ListOfCourse [icon=" + icon + ", id=" + id + ", fullname=" + fullname + ", displayname=" + displayname
				+ ", shortname=" + shortname + ", author_name=" + author_name + ", price=" + price + ", rating="
				+ rating + ", course_validity=" + course_validity + ", video_link=" + video_link + ", root=" + root
				+ ", mode=" + mode + ", topic=" + topic + ", section=" + section + ", total_lecturs=" + total_lecturs
				+ ", course_description=" + course_description + ", requirments=" + requirments + ", feedbackString="
				+ feedbackString + ", level=" + level + ", total_time=" + total_time + ", start_course_date="
				+ start_course_date + ", status=" + status + ", rate_your_experience=" + rate_your_experience + "]";
	}
	

	
}