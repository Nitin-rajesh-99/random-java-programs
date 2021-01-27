import java.io.*;
import java.net.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
class time_server_udp

{
    public static DatagramSocket serversocket;
    public static DatagramPacket dp;
    public static BufferedReader dis;
    public static InetAddress ia;
    public static byte buf[] = new byte[1024];
    public static void main(String[] a) throws IOException
    {
        serversocket = new DatagramSocket(6666);
        dp = new DatagramPacket(buf,buf.length);
        dis = new BufferedReader(new InputStreamReader(System.in));
        ia = InetAddress.getLocalHost();
        System.out.println("Server is Running...");
        while(true)
        {
            serversocket.receive(dp);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
            LocalDateTime now = LocalDateTime.now();  
            String str1 = String.valueOf(dtf.format(now));

            
            buf = str1.getBytes();
            serversocket.send(new DatagramPacket(buf,str1.length(), ia, 6667));
        }
    }
}

