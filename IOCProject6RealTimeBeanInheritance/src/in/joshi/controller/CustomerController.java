package in.joshi.controller;

import in.joshi.dto.CustomerDto;
import in.joshi.service.ICustomerManagementService;
import in.joshi.vo.CustomerVO;

public class CustomerController {
	
	private ICustomerManagementService service;

	public CustomerController(ICustomerManagementService service) {
		System.out.println("Customer Controller :: 1 Param constructor is loading");
		this.service = service;
	}
	
	public String processResult(CustomerVO vo) {
		CustomerDto dto = new CustomerDto();
		dto.setCustomerName(vo.getCustomerName());
		dto.setCustomerAddress(vo.getCustomerAddress());
		dto.setPamt(Float.parseFloat(vo.getPamt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		String result = service.calculateSimpleInterest(dto);
		return result;
	}

	
	
	
	
}
