package in.joshi.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.joshi.bean.College;
import in.joshi.bean.ContactInfo;
import in.joshi.bean.MarksInfo;
import in.joshi.bean.UniversityInfo;

public class TestApp {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/joshi/cfg/applicationContext.xml");

		MarksInfo marksinfo = factory.getBean("marksinfo", MarksInfo.class);
		System.out.println(marksinfo);

		College clg = factory.getBean("clg", College.class);
		System.out.println(clg);

		ContactInfo contactInfo = factory.getBean("contactsinfo", ContactInfo.class);
		System.out.println(contactInfo);

		UniversityInfo university = factory.getBean("universityinfo", UniversityInfo.class);
		System.out.println(university);
	}

}