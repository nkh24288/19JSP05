package Day2;

import java.sql.Connection;
import java.sql.SQLException;

public class MainConn {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		
		Connection connec = new ConnectionUtils().getMyConnection();
		//connec.getMyConnection();
		//Connection connec = ConnectionUtils.getMyConnection(); cai nay dung
		System.out.print(connec);
		
	}

}
