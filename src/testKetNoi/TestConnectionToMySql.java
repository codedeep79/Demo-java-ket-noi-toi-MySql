package testKetNoi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class TestConnectionToMySql {
	public static void main(String[] args) {
		try
		{
			// Không cài phần mềm chung port 3306 của MySQL như MySQL wordbench, nếu có cài
			// thì vui lòng đổi port MySQL wordbench không đổi port MySQL
			// 
			System.out.println("Đang kết nối ...");
			String strConn="jdbc:mysql://localhost/demoketnoi";
			Properties pro = new Properties();
			pro.put("user", "root");//root là account mặc lúc ta cài đặt XAMP
			pro.put("password", "");
			Driver driver=new Driver();
			Connection conn= driver.connect(strConn, pro);
			if(conn != null)
				System.out.println("Kết nối tới CSDL demoketnoi thành công");
			else
				System.err.println("Kết nối tới CSDL demoketnoi thất bại");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
