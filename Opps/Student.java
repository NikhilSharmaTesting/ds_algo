
package Opps;

public class Student {

	private String name;
	private int rNo;
	private float marks;
	static int total;
	
	static{
		total=100;
	}

	public Student() {
		this.name = "";
		this.rNo = 0;
		this.marks = 0.0f;
	}

	public Student(String name, int rNo, float marks) {
		this.name = name;
		this.rNo = rNo;
		this.marks = marks;
	}

	public String toString() {
		return "Name of the Student is " + this.name + " , roll number is " + this.rNo + " and marks are " + this.marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getrNo() {
		return rNo;
	}

	public void setrNo(int rNo) {
		this.rNo = rNo;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

}
