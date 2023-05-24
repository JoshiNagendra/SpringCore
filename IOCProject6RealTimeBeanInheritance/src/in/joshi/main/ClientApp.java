package in.joshi.main;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.joshi.controller.CustomerController;
import in.joshi.vo.CustomerVO;

public class ClientApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the customer Name ::");
		String customerName=sc.next();
		
		System.out.println("Enter the customer Address ::");
		String customerAddress=sc.next();
		
		System.out.println("Enter the p amount   ::");
		String pmt = sc.next();
		
		
		System.out.println("Enter the Rate       ::");
		String rate=sc.next();
		
		System.out.println("Enter the time period ::");
		String time=sc.next();
		
		CustomerVO vo = new CustomerVO();
		vo.setCustomerName(customerName);
		vo.setCustomerAddress(customerAddress);
		vo.setPamt(pmt);
		vo.setRate(rate);
		vo.setTime(time);
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/joshi/cfg/applicationContext.xml");
		
		CustomerController controller = factory.getBean("controller",CustomerController.class);
		String result = controller.processResult(vo);
		System.out.println(result);
		
	}

}
