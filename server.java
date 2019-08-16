import java.net.ServerSocket;
import java.net.Socket;

public class server
{
        public static void main(String args[])
        {
                try{
                        System.out.println("Waiting for Client");
                        ServerSocket s = new ServerSocket(11111);
                        Socket soc = s.accept();
                        System.out.println("Connection Established");
                }
                catch(Exception e)
                {
                        e.printStackTrace();
                }
        }
}
