
public class InstructorManager {
	

	public void login(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " Login successful!"  );
	}

	
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getCourse() + " Course added");
		
	}
	
}
