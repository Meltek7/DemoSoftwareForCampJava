package demoForD2H1;

public class Course {
	int id;
	String name;
	int categoryId;
	int lecturerId;
	double completionRate;
	
	public Course(int id,String name,int categoryId, int lecturerId,double completionRate) {
		this.id=id;
		this.name=name;
		this.categoryId=categoryId;
		this.lecturerId=lecturerId;
		this.completionRate=completionRate;
	}
	
}
