/*
Write a class encapsulating the concept of a course
grade, assuming a course grade has the following
attributes: a course name and a letter grade. Include a
constructor, the accessors and mutators, and methods
toString and equals. Write a client class to test all the
methods in your class.
 */
public class Client {
	public static void main (String[] args){
		
		//Create objects and starting attributes
	    Course a = new Course("Java I", "A");
	    Course b = new Course("STA 220", "B");
	    
	    //Print out the sample text using accessors
	    System.out.println("The course of course grade #1 is " + a.getName()
	    +"\nThe grade of course grade #1 is " + a.getGrade()
	    +"\nCourse Grade #2 is course name: " + b.getName()
	    +"; grade: " + b.getGrade());  
	    
	    //Print out comparison and modify objects 
	    boolean x = true;
	    while (x) {
		    if(a.equals(b)) {
		    	System.out.println("Original CourseGrade #1 and modified CourseGrade #2 are identical");
		    	x = !x;
		    }
		    else {
		    	System.out.println("Original CourseGrade #1 and #2 are different");
		    	a = b;
		    }
	    }
	}

}
