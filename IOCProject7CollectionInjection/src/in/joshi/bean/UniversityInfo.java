package in.joshi.bean;

import java.util.Date;
import java.util.Map;
import java.util.Properties;


public class UniversityInfo {
	
	static {
		System.out.println("UniversityInfo .class is loading.....");
	}
	
	public UniversityInfo() {
		System.out.println("University Object is Instansiated...");
	}
	
	private Map<Integer,String> facultyDetails;
	
	private Map<String, Date> dateinfo;
	
	private Properties properties;


	
	public void setFacultyDetails(Map<Integer, String> facultyDetails) {
		this.facultyDetails = facultyDetails;
	}

	public void setDateinfo(Map<String, Date> dateinfo) {
		this.dateinfo = dateinfo;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "UniversityInfo [facultyDetails=" + facultyDetails + ", dateinfo=" + dateinfo + ", properties="
				+ properties + "]";
	}

	

	

	

	
	
	
	
	
}