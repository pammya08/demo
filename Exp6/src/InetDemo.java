import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress ip1=InetAddress.getLocalHost();
			System.out.println("ip ="+ip1.getHostAddress());
			InetAddress ip=InetAddress.getByName("www.google.com");
			System.out.println("ip ="+ip.getHostAddress());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
