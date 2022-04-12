package com.course.education.service;

import java.util.List;
import com.course.education.model.ListOfCategory;
import com.course.education.model.ListOfCourse;

public interface CourseService {

	public List<ListOfCourse> getAllCourse();

	public ListOfCourse getCourse(int id);

	public String purchaseCourse(String courseid);

	public ListOfCategory allCategory();

	public ListOfCategory getCategory(Integer categoryid);

	public List<ListOfCourse> getCourseByLevel(String level);

	public List<ListOfCourse> getCourseByPrice(double price);

	

}
