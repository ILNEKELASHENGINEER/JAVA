import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

class Course {
	String courseName;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return courseName;
	}
}

class ListInterface {
	public static void main(String[] args) {
		List<Course> courseList = new LinkedList<>();
		courseList.add(new Course("Java"));
		courseList.add(new Course("Hibernate"));
		courseList.add(new Course("AngularJS"));

		// Accessing the list of courses Using Iterator
		Iterator<Course> courseIterator = courseList.iterator();
		System.out.println("Using Iterator to access the list of courses");
		while (courseIterator.hasNext()) {
			Course c = courseIterator.next();
			System.out.println(c); // toString() method has been overridden in the Course class
		}

		// Accessing the list of courses Using for loop
		System.out.println("Using for loop to access the list of courses");
		for (int index = 0; index < courseList.size(); index++) {
			System.out.println(courseList.get(index));
		}

		// Accessing the list of courses Using enhanced for loop (for-each)
		System.out.println("Using enhanced for loop to access the list of courses");
		for (Course c : courseList) { // Can be read as: for each Course c in courseList
			System.out.println(c);
		}
	}
}
/*
OUTPUT
Using Iterator to access the list of courses
Java
Hibernate
AngularJS
Using for loop to access the list of courses
Java
Hibernate
AngularJS
Using enhanced for loop to access the list of courses
Java
Hibernate
AngularJS
*/
