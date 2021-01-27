import java.io.*; 
import java.net.*; 
import java.util.*;
public class tcp_chat_client2 { 
    public static void main(String[] args) { 
        
        try{     
                Socket s=new Socket("localhost",6667); 
                DataInputStream dis=new DataInputStream(s.getInputStream());//inputfrom server
                Socket ss=new Socket("localhost",6668); 
                DataOutputStream dout=new DataOutputStream(ss.getOutputStream()); //outputfrom server
                Scanner read = new Scanner(System.in); 
                System.out.println("client2");
                while(true)
                {   System.out.print("client1");
                    String  str=(String)dis.readUTF();
                    
                    System.out.println(str);
                     System.out.print("client2");
                    str = read.nextLine();
                   
                    dout.writeUTF(str); 
                }
            }catch(Exception e)
            {
                System.out.println(e);} 
        
    } 
} 