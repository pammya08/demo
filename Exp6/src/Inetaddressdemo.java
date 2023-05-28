import java.net.InetAddress;

public class Inetaddressdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress ip=InetAddress.getByName("www.google.com");
			System.out.println(ip.getHostName()+"\n"+ip.getHostAddress());
			
			InetAddress ip1=InetAddress.getByName("DESKTOP-UNQ7UP1");
			System.out.println(ip1.getHostName()+"\n"+ip1.getHostAddress());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
