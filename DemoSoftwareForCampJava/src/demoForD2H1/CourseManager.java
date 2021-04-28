package demoForD2H1;

public class CourseManager {
	
	public void AddCourse(Course course) {
		System.out.println("Yeni kurs eklendi! :" + course.name);
	}
	
	public void DeleteCourse(Course course) {
		System.out.println("Kurs silindi! :" + course.name);
	}


}
