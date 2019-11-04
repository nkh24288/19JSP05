package jdbc.demo.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


import jdbc.demo.bo.Customer;
import jdbc.demo.idao.ICustomerDAO;
import jdbc.demo.utils.ConnectionUtils;

public class ICustomerDAOImpl implements ICustomerDAO{
	
	
	@Override
	public void addCustomer(Customer cus) throws SQLException, ClassNotFoundException{
		
		Connection connec = new ConnectionUtils().getMyConnection(); //dat vao trong nay
		Statement statement = connec.createStatement();
		
		System.out.println("ADD CUSTOMER (-INSERT-)");
		String sql = "INSERT INTO customers (CustomerID, CustomerName, ContactName, Address, City, PotalCode, Country) "
	              +  "values (" +cus.getCustomerID() + "," +"'" +cus.getCustomerName() + "'" +"," +"'" +cus.getContactName() + "'" 
	              + "," +"'" +cus.getAddress() + "'" + "," +"'" +cus.getCity() + "'" + "," +"'" +cus.getPotalCode() + "'"
	              + "," +"'" +cus.getCountry() + "'"+ ")";
		
		System.out.println("Customer inserted:" +sql);
		// Thuc thi cau lenh.
	    // executeUpdate(String) su dung cho cac lenh Insert,Update,Delete.
	    int rowCount = statement.executeUpdate(sql);
	    
	    // In ra so dong duoc chen vao boi cau lenh tren.
	    System.out.println("Row Count affected = " + rowCount);
	}

	@Override
	public void updateCustomer(String name) throws SQLException, ClassNotFoundException{
		
		Connection connec = new ConnectionUtils().getMyConnection(); //dat vao trong nay
		Statement statement = connec.createStatement();
		
		System.out.println("UPDATE CUSTOMER");
		String sql = "UPDATE customers SET City = Danang WHERE CustomerName='" +name +"'";
		
		System.out.println("Customer updated:" +sql);
		// Thuc thi cau lenh.
	    // executeUpdate(String) su dung cho cac lenh Insert,Update,Delete.
	    int rowCount = statement.executeUpdate(sql);
	      
	    // In ra so dong duoc UPDATE vao boi cau lenh tren.
		System.out.println("Row Count affected = " + rowCount);
	}

	@Override
	public void getCustomer(int customerID) throws SQLException, ClassNotFoundException{
		Connection connec = new ConnectionUtils().getMyConnection(); //dat vao trong nay
		Statement statement = connec.createStatement();
		
		System.out.println("GET CUSTOMER BY ID");
		String sql = "SELECT* FROM customers WHERE CustomerID='" +customerID +"'";
	}

	@Override
	public void deleteCustomer(String name) throws SQLException, ClassNotFoundException{
		
		Connection connec = new ConnectionUtils().getMyConnection(); //dat vao trong nay
		Statement statement = connec.createStatement();
		
		System.out.println("DELETE CUSTOMER BY NAME");
		String sql = "DELETE customers WHERE CustomerName='" +name +"'";
		
		System.out.println("Customer updated:" +sql);
		// Thuc thi cau lenh.
	    // executeUpdate(String) su dung cho cac lenh Insert,Update,Delete.
	    int rowCount = statement.executeUpdate(sql);
	      
	    // In ra so dong duoc UPDATE vao boi cau lenh tren.
		System.out.println("Row Count affected = " + rowCount);
	}

}
