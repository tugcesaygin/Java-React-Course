
public class Main {

	public static void main(String[] args) {
		
		
		User user = new User();
		user.setFirstName("Tugce");
		user.setLastName("Saygin");
		user.setId("1");
		user.seteMail("sssssss@sss.com");
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setId("1235");
		instructor.setCourse("Java React Kamp");
		
		Student student = new Student();
		student.setFirstName("Mina ");
		student.setLastName("Cayir");
		student.setId("2");
		student.seteMail("aaaaa@aaaa.com");
		
		
		User[] users = {user, instructor , student};
		UserManager userManager =new UserManager();
		userManager.addMultiple(users);
		userManager.delete(student);
		userManager.update(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.login(student);
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(instructor);
		instructorManager.addCourse(instructor);
		
		
		
		
		

	}

}
