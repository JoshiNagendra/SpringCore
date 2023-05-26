package in.joshi.bean;

import java.util.Date;
import java.util.List;

public class College {
	static {
		System.out.println("College .class is loading");
	}
	
	public College() {
		System.out.println("College Object is Instansiated");
	}
	
	private List<String> nameList;
	private List<Date> dateList;
	
	
	
	
	
	public void setNameList(List<String> nameList) {
		System.out.println("College.setNameList()");
		this.nameList = nameList;
		System.out.println(nameList.getClass());
	}





	public void setDateList(List<Date> dateList) {
		System.out.println("College.setDateList()");
		this.dateList = dateList;
	}


	@Override
	public String toString() {
		return "College [nameList=" + nameList + ", dateList=" + dateList + "]";
	}
	
	
}
