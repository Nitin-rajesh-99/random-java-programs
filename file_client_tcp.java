import java.io.*; 
import java.net.*; 
import java.util.*;
public class file_client_tcp { 
    public static void main(String[] args) { 
        try{     
            Socket s=new Socket("localhost",6666); 
             Socket c=new Socket("localhost",6667);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            DataInputStream dis=new DataInputStream(c.getInputStream());
            Scanner read = new Scanner(System.in);
            System.out.println("Enter filename :");
            String filename = read.nextLine();
            dout.writeUTF(filename); 
            s.close();
            String pid=(String)dis.readUTF();
            System.out.println(pid);
            String  message=(String)dis.readUTF();
            System.out.println(message);
        }catch(Exception e)
        {
            System.out.println(e);} 
    } 
} 