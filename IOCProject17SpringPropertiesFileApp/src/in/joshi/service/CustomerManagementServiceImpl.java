package in.joshi.service;

import in.joshi.bo.CustomerBO;
import in.joshi.dao.ICustomerDao;
import in.joshi.dto.CustomerDto;

public class CustomerManagementServiceImpl implements ICustomerManagementService {

	static {
		System.out.println("CustomerMgmtServiceImpl .class is loading....");
	}
	private ICustomerDao dao;

	public CustomerManagementServiceImpl(ICustomerDao dao) {
		System.out.println("CustomerManagementServiceImpl :: 1 Param Constructor is loading");

		this.dao = dao;
	}

	@Override
	public String calculateSimpleInterest(CustomerDto dto) {
		float intamt = 0.0f;
		intamt = dto.getPamt() * dto.getTime() * dto.getRate() / 100.0f;
		CustomerBO bo = new CustomerBO();
		bo.setCustomerName(dto.getCustomerName());
		bo.setCustomerAddress(dto.getCustomerAddress());
		bo.setPamt(dto.getPamt());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setInterestAmount(intamt);
		int count = dao.insert(bo);
		if (count == 1) {
			return "Regestration Success for :: " + dto.getCustomerName() + " : for amount :: " + dto.getPamt()
					+ " Interest Rate is :: " + intamt;
		} else {
			return "Regestration Failed for :: " + dto.getCustomerName() + " : for amount :: " + dto.getPamt()
					+ " Interest Rate is :: " + intamt;

		}

	}

}
