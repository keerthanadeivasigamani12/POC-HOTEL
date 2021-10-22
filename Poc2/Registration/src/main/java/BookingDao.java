import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookingDao {
	private String dbUrl = "jdbc:mysql://localhost:3306/hotel";
	private String dbUname = "root";
	private String dbPassword = "Keerthi@123";
	private String dbDriver = "com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public String insert(Memberbooking memberbooking)
	{
		loadDriver(dbDriver);
		Connection con = getConnection();
		String result = "Data entered successfully";
		String sql = "insert into booking values(?,?,?,?,?)";
		
		PreparedStatement ps;
		try {
		ps = con.prepareStatement(sql);
		
		ps.setString(1, memberbooking.getUname());
		ps.setString(2, memberbooking.getRoomnumber());
		ps.setString(3, memberbooking.getNoofmemberstostay());
		ps.setString(4, memberbooking.getStayfrom());
		ps.setString(5, memberbooking.getStayto());
		ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			result = "Data not entered";
		}
		return result;
	}
	public void update(Memberbooking memberbooking)
	{
		loadDriver(dbDriver);
		Connection con = getConnection();
		
		String sql = "UPDATE hotelroom set Roomstatus = ?  where Roomnumber = ?";
		
		PreparedStatement ps;
		try {
		ps = con.prepareStatement(sql);
		
		ps.setString(1, "booked");
		ps.setString(2, memberbooking.getRoomnumber());
		
		ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
	}

}



