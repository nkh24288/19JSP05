package jdbc.demo.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Day2.ConnectionUtils;
import jdbc.demo.bo.Customer;
import jdbc.demo.dao.ICustomerDAOImpl;
import jdbc.demo.idao.ICustomerDAO;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection connec = new ConnectionUtils().getMyConnection();
		Statement statement = connec.createStatement();
		
		ICustomerDAO cusDAO = new ICustomerDAOImpl();
		Customer cus = new Customer(11, "Ronaldo", "Jr", "Sapaolo", "Pragao", "956PC", "Poturgal");
		
		//ADD
		cusDAO.addCustomer(cus);
		
		//UPDATE (new City = Danang)
		cusDAO.updateCustomer("Maria Sofia");
		
		//DELETE
		cusDAO.deleteCustomer("Turino");
		
		//GET
		cusDAO.getCustomer(2);
	}	
	
}
