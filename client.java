//import java.net.ServerSocket;
import java.net.Socket;

public class client
{
	public static void main(String args[])
	{
		try{
			System.out.println("Client Started");
			//ServerSocket s = new ServerSocket(11111); 
			Socket soc = new Socket("localhost",11111);
			//System.out.println("Connection Established");	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
