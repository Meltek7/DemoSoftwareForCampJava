package demoForD3H2;

public class StudentManager extends UserManager {
	
	public void registerCourse(Student student, Course course) {
		System.out.println(student.username +", " + course.name + " kursuna kay�t oldu!");
	}
	
	public void leaveComment() {
		System.out.println("Yorum g�nderildi!!");
	}

}
