/*
Write a class encapsulating the concept of a course
grade, assuming a course grade has the following
attributes: a course name and a letter grade. Include a
constructor, the accessors and mutators, and methods
toString and equals. Write a client class to test all the
methods in your class.
 */


public class Course {
	private String name;
	private String grade;
	
		public Course(String name, String grade) {
			this.name = name;
			this.grade = grade;
		}
		
		//Accessors
		public String getName() {
			return name;
		}
		
		public String getGrade() {
			return grade;
		}
		
		//Mutators
		public void setName(String newName) {
			name = newName;
		}
		
		public void setGrade(String newGrade) {
			grade = newGrade;
		}
		
		//Overriding the toString
		public String toString() {
			return name +" " +grade;
		}
}
