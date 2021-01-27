import java.io.*; 
import java.net.*; 
import java.util.*;
public class tcp_chat_client { 
    public static void main(String[] args) { 
       
        try{     
                Socket s=new Socket("localhost",6666); 
                DataOutputStream dout=new DataOutputStream(s.getOutputStream()); //outputfrom server
                 Socket ss=new Socket("localhost",6669); 
                DataInputStream din=new DataInputStream(ss.getInputStream()); //inputfrom server
                Scanner read = new Scanner(System.in); 
                System.out.println("client1");
                while(true)
                {    System.out.print("client1:");
                    String str = read.nextLine();
                    dout.writeUTF(str);
                    str=(String)din.readUTF();
                     System.out.print("client2:");
                    System.out.println(str);
                }
            }catch(Exception e)
            {
                System.out.println(e);} 
        
    } 
} 