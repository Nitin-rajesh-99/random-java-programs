import java.io.*; 
import java.net.*; 
public class tcp_Server { 

    public static void main(String[] args){ 
        try{ 
            ServerSocket ss=new ServerSocket(6666); 
            Socket s=ss.accept();//establishes connection  
            String pass2="123";
            DataInputStream dis=new DataInputStream(s.getInputStream()); 
            String  str=(String)dis.readUTF();
            String  pass1=(String)dis.readUTF();
            if(pass1.equals(pass2))
            {   
                System.out.println("message= "+str);  
                ss.close();
            }
            else
            {
                System.out.println("Connection Refused!!");
            } 
        }catch(Exception e){System.out.println(e);} 
    } 
} 
