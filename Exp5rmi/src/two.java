import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class two extends UnicastRemoteObject implements one{

	protected two() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int pallin(String str) throws RemoteException {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer(str);
		String str1=sb.toString();
		System.out.println("the string is"+str1);
		String str2=sb.reverse().toString();
		System.out.println("the reverse string is"+str2);
		
		int b=str1.compareTo(str2);
		
		if(b==0) {
			return 1;
		}
		return 0;
	}

}
