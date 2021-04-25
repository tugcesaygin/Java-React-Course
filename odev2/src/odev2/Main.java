package odev2;

public class Main {

	public static void main(String[] args) {
			
		Course course1 = new Course(1, "Java - React");
		Course course2 = new Course(2, "C# + Angular");
		
		CourseManager courseManager = new CourseManager();
		courseManager.joinCourse(course1);
		courseManager.joinCourse(course2);
		courseManager.rollCall(course1);
		courseManager.rollCall(course2);
		
	
		Category categoryFirst = new Category();
		categoryFirst.idOfCategory = 1;
		categoryFirst.nameOfCategory = "Programlama";
		
		
		System.out.println("Category : " +categoryFirst.nameOfCategory);
        
		Course[] courses = {course1,course2};
		
		for(Course course : courses) {
			System.out.println(course.name);
		}
		
		Educator educatorFirst = new Educator();
		educatorFirst.nameOfEducator = "Engin Demirog";
		
		System.out.println("Educator : " +educatorFirst.nameOfEducator);
		
	
		
		
		
		}


	}


