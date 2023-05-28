import java.io.*;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.net.*;
public class rmiclient
{
    public static void main(String args[]) throws Exception
    {
    	
        try
        {
           one onex=(one) Naming.lookup("rmi://localhost:1990/palin");
            int m = onex.palin("madam");
            System.out.println("Print : " + m);
            if (m == 1)
            {
                System.out.println("The given string is a Palindrome");
            }
            else
            {
                System.out.println("The given string is not a Palindrome");
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception" + e);
        }
    }
}
         