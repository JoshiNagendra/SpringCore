package in.joshi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import in.joshi.bo.CustomerBO;

public class CustomerDaoImpl implements ICustomerDao {

	static {
		System.out.println("CustomerDaoImp .class is loading");
	}
	private DataSource datasource;
	public final String SQL_INSERT_QUERY="insert into spring_customer(`cname`,`caddr`,`camt`,`crate`,`ctime`,`interest`) values(?,?,?,?,?,?)";
	int count=0;
	
	
	public CustomerDaoImpl(DataSource datasource) {
		System.out.println("CustomerDao Impl :: 1 Param constructor ");
		this.datasource = datasource;
	}


	public int insert(CustomerBO bo) {

		try (Connection connection = datasource.getConnection()) {
			System.out.println("connection established succesfully....");
			
			PreparedStatement pstmnt = connection.prepareStatement(SQL_INSERT_QUERY);
			pstmnt.setString(1,bo.getCustomerName());
			pstmnt.setString(2, bo.getCustomerAddress());
			pstmnt.setFloat(3,bo.getPamt());
			pstmnt.setFloat(4,bo.getRate());
			pstmnt.setFloat(5, bo.getTime());
			pstmnt.setFloat(6, bo.getInterestAmount());
			 count = pstmnt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return count;
	}


}
