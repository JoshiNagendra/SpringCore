package in.joshi.bean;

import java.util.Date;
import java.util.Set;

public class ContactInfo {
	
	static {
		System.out.println("ContactInfo .class is laoding");
	}
	
	public ContactInfo() {
		System.out.println("ContanInfo Object is instantiated...");
	}
	private Set<Long> phoneNumbers;
	
	private Set<Date> dates;
	
	
	


	public ContactInfo(Set<Long> phoneNumbers, Set<Date> dates) {
		System.out.println("Paramaeterised Constructor is created");
		this.phoneNumbers = phoneNumbers;
		this.dates = dates;
		System.out.println(phoneNumbers.getClass());
	}




	@Override
	public String toString() {
		return "ContactInfo [phoneNumbers=" + phoneNumbers + ", dates=" + dates + "]";
	}
	
	
	

}
