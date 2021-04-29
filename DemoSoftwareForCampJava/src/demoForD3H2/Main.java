package demoForD3H2;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.id=1;
		student.username="meltek";
		student.email="meltemtekeli7@gmail.com";
	
		Instructor instructor = new Instructor();
		instructor.id=1;
		instructor.username="benimHocam";
		instructor.phoneNumber="132456";
		
		Course course = new Course();
		course.id=1;
		course.name="Java";
		course.instructorId=1;
		
		
		
		UserManager userManager = new UserManager();
		userManager.SignIn(student);
		userManager.SignOut(instructor);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(course);
		
		StudentManager studentManager=new StudentManager();
		studentManager.registerCourse(student, course);
		studentManager.leaveComment();
		
	}

}
