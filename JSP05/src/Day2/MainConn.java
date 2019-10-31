package Day2;

//import java.util.ArrayList;
//import java.util.List;

//import java.awt.List;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainConn {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		Connection connec = new ConnectionUtils().getMyConnection();
		//connec.getMyConnection();
		//Connection connec = ConnectionUtils.getMyConnection(); cai nay dung
		System.out.print(connec); //in kiem tra co ket noi duoc hay khong
		
		
		Statement statement = connec.createStatement();
		
		String sql = "Select categoriesID, cate_Name from categories";
		
		ResultSet rs = statement.executeQuery(sql);
		
		while(rs.next()) {
			int cateID = rs.getInt("categoriesID");
			String cateName = rs.getString("cate_Name");
			System.out.println("...............");
			System.out.println("cateID:" +cateID);
			System.out.println("cateName:" +cateName);
			
			/*Categories cate1 = new Categories(cateID, cateName);
					
			List<Categories> cate = new ArrayList<Categories>();
				cate.add(cate1);
			
				System.out.println("cate:" +cate);*/
				
			}
		
			connec.close();
		}
		
		
		
		
	}


