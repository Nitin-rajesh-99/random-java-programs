import java.io.*; 
import java.net.*; 
public class tcp_chat_server { 

    public static void main(String[] args){ 

        try{ 
            ServerSocket s1=new ServerSocket(6666); //to recieve from client1
            Socket s=s1.accept();//establishes connection with client1
            ServerSocket s2=new ServerSocket(6667);//for sending to client 2
            Socket ss=s2.accept();///establishes connection with client2
            ServerSocket s3=new ServerSocket(6668);//to recieve from client2
            Socket sss=s3.accept();///establishes connection with client2
            ServerSocket s4=new ServerSocket(6669);//to send to client 1
            Socket ssss=s4.accept();///establishes connection with client1
            DataOutputStream client2write=new DataOutputStream(ss.getOutputStream());//writing to client 2
            DataInputStream client1read=new DataInputStream(s.getInputStream()); //reading from client 1
            DataOutputStream client1write=new DataOutputStream(ssss.getOutputStream());//writing to client 1
            DataInputStream client2read=new DataInputStream(sss.getInputStream()); //reading from client 2
            while(true)
            {
                String  str=(String)client1read.readUTF();
                client2write.writeUTF(str);
                str=(String)client2read.readUTF();
                client1write.writeUTF(str);
            }
        }catch(Exception e)
        {System.out.println(e);} 

    } 
} 
