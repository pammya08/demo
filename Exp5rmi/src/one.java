import java.rmi.Remote;
import java.rmi.RemoteException;

public interface one extends Remote{
	public int pallin(String str)throws RemoteException;

}
