
public class Student {
	// Declare all instance variables
	private String name;
	private int test1;
	private int test2;
	private int test3;
	
	// Constructor Method/s
	public Student() {
		// initialize our properties
		name = "";
		test1 = 0;
		test2 = 0;
		test3 = 0;
	}
	// method overload
	public Student(String nm) {
		name = nm;
		test1 = 0;
		test2 = 0;
		test3 = 0;
	}
	public Student(String nm, int t1, int t2,
			int t3) {
		name = nm;
		test1 = t1;
		test2 = t2;
		test3 = t3;
	}
	// Other Methods (get/set aka accessors and mutators)
	public String getStudentName() {
		return name;
	}
	public void setStudentName(String nm) {
		name = nm;
	}
	public int getScore(int i) {
		if (i == 1) 		return test1;
		else if (i == 2) 	return test2;
		else 				return test3;
	}
	public void setScore(int i, int score) {
		if (i == 1)			test1 = score;
		else if (i == 2) 	test2 = score;
		else				test3 = score;
	}
	public String toString() {
		String str;
		str = "Name: " + name + "\n" +
			"Test 1: " + test1 + "\n" +
			"Test 2: " + test2 + "\n" +
			"Test 3: " + test3 + "\n" +
			"Average Score: " + getAverage();
		return str;
	}
	public int getAverage() {
		int average;
		average = (int) Math.round( (test1 +
				test2 + test3) / 3.0);
		return average;
	}
}
