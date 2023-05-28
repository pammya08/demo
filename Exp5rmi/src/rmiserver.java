import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class rmiserver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			one onex=(one) new two();
			LocateRegistry.createRegistry(1990);
			Naming.rebind("rmi://localhost:1990/palin", onex);
			System.out.println("server is ready");
		} catch (RemoteException | MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
