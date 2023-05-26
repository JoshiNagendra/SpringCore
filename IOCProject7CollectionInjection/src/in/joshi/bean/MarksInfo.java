package in.joshi.bean;

import java.util.Arrays;
import java.util.Date;

public class MarksInfo {
	
	static {
		System.out.println("Marks Info .class is loading");
	}
	
	public MarksInfo() {
		System.out.println("Marks Info Zero Parameter constructor is created");
	}
	private int marks[];
	
	private Date date[];
	
	
	

	public void setMarks(int[] marks) {
		this.marks = marks;
	}




	public void setDate(Date[] date) {
		this.date = date;
	}




	@Override
	public String toString() {
		return "MarksInfo [marks=" + Arrays.toString(marks) + ", date=" + Arrays.toString(date) + "]";
	}
	
	

}
