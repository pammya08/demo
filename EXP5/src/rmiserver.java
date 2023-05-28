import java.rmi.*;
import java.rmi.registry.LocateRegistry;
public class rmiserver
{
    public static void main(String args[]) throws Exception
    {
        try
        {
           two onex=new two();
          
           
         // rmiregistry within the server JVM with
            // port number 0
            LocateRegistry.createRegistry(1990);
 
            // Binds the remote object by the name
            // geeksforgeeks
            Naming.rebind("rmi://localhost:1990/palin",onex);
            System.out.println("server is ready");
            
        }
        catch(Exception e)
        {
            System.out.println("Exception" + e);
        }
    }
}
