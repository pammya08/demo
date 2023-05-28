import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class rmiclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			one onex=(one) Naming.lookup("rmi://localhost:1990/palin");
			int m=onex.pallin("madam");
			if(m==1) {
				System.out.println("the string is palindrome");
			}
			else {
				System.out.println("the string is not palindrome");
			}
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
