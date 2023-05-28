import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/student";
		String user="root";
		String pass="Pravin08@";
		/* 
		 create database student;
		 use student;
		 create table student(id int(10),name varchar(255),department varchar(10));
		 insert into student values(1,"pramod","entc");
		 */
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, pass);
			
				Statement stmt=con.createStatement();
				System.out.println("connected");
				ResultSet rs1=stmt.executeQuery("select * from student");
				System.out.println("Data before insertion");
				System.out.print("  id "+"   name  "+"  department  ");
				while(rs1.next()) {
					System.out.print(" "+rs1.getInt("id")+" "+rs1.getString("name")+" "+rs1.getString("department"));
				System.out.println();
				}
				System.out.println("Data after insertion");
				int rs2=stmt.executeUpdate("insert into student values(2,'shailesh','entc')");
				if(rs2>0) {
					System.out.println("data is inserted");
				}
				else {
					System.out.println("data is not inserted");
				}
				ResultSet rs3=stmt.executeQuery("select * from student");
				System.out.println("Data before insertion");
				System.out.print("  id "+"   name  "+"  department  ");
				while(rs3.next()) {
					System.out.print(" "+rs3.getInt("id")+" "+rs3.getString("name")+" "+rs3.getString("department"));
				System.out.println();
				}
				
			 
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
