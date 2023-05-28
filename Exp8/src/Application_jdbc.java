import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Application_jdbc {

	
	
	public static void create() {
		String usr,url,pass;
		url="jdbc:mysql://localhost/jdbcdemo";
		usr="root";
		pass="Pravin08@";
		try {
			Connection con= DriverManager.getConnection(url, usr, pass);
			Statement p=con.createStatement();
			p.execute("Create table student(name varchar(20),department varchar(20))");
			p.executeUpdate("insert into student values('shailesh','entc')");
			System.out.println("table created succesfully");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	public static void deletetable() {
		String usr,url,pass;
		url="jdbc:mysql://localhost/jdbcdemo";
		usr="root";
		pass="Pravin08@";
		try {
			Connection con= DriverManager.getConnection(url, usr, pass);
			Statement p=con.createStatement();
			p.execute("drop table student");
			System.out.println("table deleted succesfully");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	public static void insertdata(String name,String department) {
		String usr,url,pass;
		url="jdbc:mysql://localhost/jdbcdemo";
		usr="root";
		pass="Pravin08@";
		try {
			Connection con= DriverManager.getConnection(url, usr, pass);
			Statement p=con.createStatement();
			p.executeUpdate("insert into student values('"+name+"','"+department+"')");
			System.out.println("table updated succesfully");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		}
	public static void showdata() {
		String usr,url,pass;
		url="jdbc:mysql://localhost/jdbcdemo";
		usr="root";
		pass="Pravin08@";
		try {
			Connection con= DriverManager.getConnection(url, usr, pass);
			PreparedStatement p=con.prepareStatement("select * from student");
			ResultSet rs=p.executeQuery();
			System.out.println("table data:-");
			System.out.println("|  name  |"+"|   department   |");
			while(rs.next()) {
				System.out.println("|  "+rs.getString(1)+"  |"+"|   "+rs.getString(2)+"        |");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		}
		
	public static void updatedepart(String name,String department) {
		String usr,url,pass;
		url="jdbc:mysql://localhost/jdbcdemo";
		usr="root";
		pass="Pravin08@";
		try {
			Connection con= DriverManager.getConnection(url, usr, pass);
			Statement p=con.createStatement();
			p.executeUpdate("update student set department='"+department+"' where name='"+name+"'");
			System.out.println("table data updated succesfully");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		}
		
		public static void deletedata(String name) {
			String usr,url,pass;
			url="jdbc:mysql://localhost/jdbcdemo";
			usr="root";
			pass="Pravin08@";
			try {
				Connection con= DriverManager.getConnection(url, usr, pass);
				Statement p=con.createStatement();
				p.executeUpdate("delete from student where name='"+name+"'");
				System.out.println("table updated succesfully");
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
		Scanner s=new Scanner(System.in);
		System.out.println("1.create\n2.insertdata\n3.showdata\n4.update department\n5.delete data\n6.deletetable\n7.close");
		int i=s.nextInt();
		switch(i) {
		case 1:
		create();
		break;
		case 2:
			System.out.println("enter the name=");
			s.nextLine();
			String name=s.nextLine();
			System.out.println("enter the department=");
			String dept=s.nextLine();
		insertdata(name,dept);
		break;
		case 3:
		showdata();
		break;
		case 4:
			System.out.println("enter the name to search =");
			s.nextLine();
			String name1=s.nextLine();
			System.out.println("enter the department to update=");
			String dept1=s.nextLine();
		updatedepart(name1,dept1);
		break;
		case 5:
			System.out.println("enter the name to delete =");
			s.nextLine();
			String name2=s.nextLine();
		deletedata(name2);
		break;
		case 6:
		deletetable();
		break;
		case 7:
			System.exit(0);
			break;
		}
		}

	}

}
