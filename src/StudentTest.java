
public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create our first student
		Student s1; // declares an object instance
		s1 = new Student(); // initialize an instance of the Student class
		Student s3 = new Student("Sam");
		Student s2 = new Student("Phred", 
				90, 80, 70);
		s1.setStudentName("Luisa"); // set the name
		s3.setStudentName("Alonso");
		System.out.println("You just created " +
				s1.getStudentName() + ", our first student.");
		s1.setScore(1, 85);
		s1.setScore(2, 95);
		s1.setScore(3, 90);
		System.out.println("The average of " + s1.getStudentName() + 
				"'s 3 test scores is " + s1.getAverage() + ".");
		System.out.println("\n\nTesting toString: " + s2.toString());
	}
}
