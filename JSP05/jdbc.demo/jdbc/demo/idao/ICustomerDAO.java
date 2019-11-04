package jdbc.demo.idao;

import java.sql.SQLException;

import jdbc.demo.bo.Customer;

public interface ICustomerDAO {
	void addCustomer(Customer cus) throws SQLException, ClassNotFoundException;
	void updateCustomer(String name) throws SQLException, ClassNotFoundException;
	void getCustomer(int customerID) throws SQLException, ClassNotFoundException;
	void deleteCustomer(String name) throws SQLException, ClassNotFoundException;
}
