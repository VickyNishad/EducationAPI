package com.course.education.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.course.education.model.Computers;
import com.course.education.model.Item;
import com.course.education.model.ListOfCategory;
import com.course.education.model.ListOfCourse;
import com.course.education.model.MutualFunds;
import com.course.education.model.Root;
import com.course.education.model.Section;


/**
 * 
 * @author 33000014
 *
 */

@Service
public class CourseServiceImpl implements CourseService {
	
	
	List<ListOfCourse> list;
	List<ListOfCourse> courselist;
	List<Section> list2;
	List<Item> list3;
	List<Item> list4;
	List<Item> list5;
	
	public CourseServiceImpl() {

		
		list = new ArrayList<ListOfCourse>();
		list2 = new ArrayList<Section>();
		list3 = new ArrayList<Item>();
		list4 = new ArrayList<Item>();
		list5 = new ArrayList<Item>();
		list3.add(0,
				new Item(true, "01:20", "1", 1, "udi udi-play-circle", false, false, " ", 26423406,
						"//storage.googleapis.com/media-session/caminandes/short.mp4#t=80",
						"/course/aspnet-web-api-2-hands-on/learn/video/21142282", "Introduction", 1, "video"));
		list3.add(1,
				new Item(true, "01:20", "1", 1, "udi udi-play-circle", false, false, " ", 21142292,
						"//storage.googleapis.com/media-session/caminandes/short.mp4#t=80",
						"/course/aspnet-web-api-2-hands-on/learn/video/21142292", "Tools", 2, "video"));
		list3.add(2, new Item(true, "01:20", "1", 1, "udi udi-play-circle", false, false, " ", 21142316,
				"//storage.googleapis.com/media-session/caminandes/short.mp4#t=80",
				"/course/aspnet-web-api-2-hands-on/learn/video/21142316", "Create a New Web Application", 3, "video"));
		list3.add(3,
				new Item(true, "01:20", "1", 1, "udi udi-play-circle", false, false, " ", 21142330,
						"//storage.googleapis.com/media-session/caminandes/short.mp4#t=80",
						"/course/aspnet-web-api-2-hands-on/learn/video/21142330", "Project Overview", 4, "video"));

		list4.add(0,
				new Item(true, "01:20", "1", 1, "udi udi-play-circle", false, false, " ", 26423406,
						"//storage.googleapis.com/media-session/caminandes/short.mp4#t=80",
						"/course/aspnet-web-api-2-hands-on/learn/video/21142282", "Introduction", 1, "video"));
		list4.add(1,
				new Item(true, "01:20", "1", 1, "udi udi-play-circle", false, false, " ", 21142292,
						"//storage.googleapis.com/media-session/caminandes/short.mp4#t=80",
						"/course/aspnet-web-api-2-hands-on/learn/video/21142292", "Model-View-Controller (MVC) Pattern",
						2, "video"));

		list5.add(0,
				new Item(true, "01:20", "1", 1, "udi udi-play-circle", false, false, " ", 26423406,
						"//storage.googleapis.com/media-session/caminandes/short.mp4#t=80",
						"/course/aspnet-web-api-2-hands-on/learn/video/21142282", "Introduction", 1, "video"));
		list5.add(1,
				new Item(true, "01:20", "1", 1, "udi udi-play-circle", false, false, " ", 21142292,
						"//storage.googleapis.com/media-session/caminandes/short.mp4#t=80",
						"/course/aspnet-web-api-2-hands-on/learn/video/21142292",
						"Object-Relational-Mapping & Code-First Migration Explained", 2, "video"));

		list2.add(0, new Section("14:14", 854, 0, list3, 4, "Introduction"));
		list2.add(1, new Section("30:39", 213, 1, list4, 2, "Web API"));
		list2.add(2, new Section("40:27", 1313, 2, list5, 2, "Entity Framework"));


		Root root = new Root(list2, " ", 1, 1);

		list.add(new ListOfCourse(
				"https://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/Python.svg/800px-Python.svg.png", 1,
				"Python", "Python", "Python", "ayush", 50.00, 4, "6 month",
				"https://www.youtube.com/watch?v=hEgO047GxaQ", root, "100% online", 5, "15 section", "143 lecturs", "",
				"", "5", "intermediate", "14h 10min", "5th feb ,2022", "", 5));
		list.add(new ListOfCourse("https://www.gcreddy.com/wp-content/uploads/2021/05/Java-Programming-Language-1.png",
				2, "java", "java", "java", "java", 20.00, 4, "6 month", "https://www.youtube.com/watch?v=lL2PXC1fmnQ",
				root, "100% online", 5, "15 section", "143 lecturs", "", "", "5", "beginner", "14h 10min",
				"5th feb ,2022", "", 5));
		list.add(new ListOfCourse(
				"https://ares.decipherzone.com/blog-manager/uploads/banner_3ceec8dc-c260-47d9-a8f8-79dd0ee7ea37.jpg", 3,
				"web development", "web development", "web development", "ayush", 30.00, 4, "6 month",
				"https://www.youtube.com/watch?v=l1EssrLxt7E", root, "100% online", 5, "15 section", "143 lecturs", "",
				"", "5", "beginner", "14h 10min", "5th feb ,2022", "", 5));
		list.add(new ListOfCourse(
				"https://doc.utimf.com/v1/AUTH_5b9dd00b-8132-4a21-a800-711111810cee/UTIContainer/Guide%20on%20How%20Mutual%20Funds%20Work%3F20200809-141343.jpg",
				4, "mutual funds", "mutual funds", "mutual funds", "ayush", 40.00, 4, "6 month",
				"https://www.youtube.com/watch?v=M988_fsOSWo", root, "100% online", 5, "15 section", "143 lecturs", "",
				"", "5", "advance", "14h 10min", "5th feb ,2022", "", 5));
		list.add(new ListOfCourse(
				"http://www.brainwareuniversity.ac.in/blog/wp-content/uploads/2021/10/Illustration-Of-Cloud-Comp-1050x450-1.jpg",
				5, "Cloud computing", "Cloud computing", "Cloud computing", "ayush", 10.00, 4, "6 month",
				"https://www.youtube.com/watch?v=M988_fsOSWo", root, "100% online", 5, "15 section", "143 lecturs", "",
				"", "5", "beginner", "14h 10min", "5th feb ,2022", "", 5));
	

	}

	
	MutualFunds mutualFunds = new MutualFunds(1 , "MutualFunds" , "MutualFunds", list);
	Computers computers = new Computers(2 , "Computers" , "Computers" , list);
	
	ListOfCategory listOfCategory  =new ListOfCategory(mutualFunds ,computers);
	 
	
	@Override
	public List<ListOfCourse> getAllCourse() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public ListOfCourse getCourse(int id) {
		ListOfCourse course = null;
		for (ListOfCourse listOfCourse : list) {
			if(listOfCourse.getId() == id)
			{
				course= listOfCourse;
				
			}
			
		}
		return course;
	}

	@Override
	public ListOfCategory allCategory() {
		// TODO Auto-generated method stub
		System.out.println(listOfCategory.getComputers());
		return listOfCategory;
	}

	@Override
	public String purchaseCourse(String courseid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListOfCategory getCategory(Integer categoryid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ListOfCourse> getCourseByLevel(String level) {
		// TODO Auto-generated method stub
		courselist =new ArrayList<ListOfCourse>();
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i).getLevel().contains(level))
			{
				courselist.add(list.get(i)); 
			}
		}
		return courselist;
	}

	@Override
	public List<ListOfCourse> getCourseByPrice(double price) {
		Double double1 = price;
		courselist =new ArrayList<ListOfCourse>();
		
		for(int i=0; i<list.size(); i++)
		{
			if(Double.compare(double1, list.get(i).getPrice()) >= 0  )
			{
				courselist.add(list.get(i)); 
			}
		
		}
		return courselist;
	}

}
