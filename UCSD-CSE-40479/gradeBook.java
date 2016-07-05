
public class GradeBook {
	
	private String courseName; // course name for this GradeBook
	
	// method to set the course name
	public void setCourseName (String name) {
		courseName = name; // store the course name
	}
	
	// method to retrieve the course name
	public String getCourseName() {
		return courseName; 
	}
	
	// display a welcome message to the GradeBook user
	// public void displayMessage(String courseName) {
	// System.out.printf("Welcome to the Grade Book for \n%s\n!", courseName);
	
	// display a welcome message to the GradeBook user
	// call getCourseName to get the name of the course this GradeBook represents
	public void displayMessage() {
	 System.out.printf("Welcome to the Grade Book for \n%s\n!", getCourseName());
	
	}
}
