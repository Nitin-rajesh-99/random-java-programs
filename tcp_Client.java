import java.io.*; 
import java.net.*; 
import java.util.*;
public class tcp_Client { 
    public static void main(String[] args) { 
        try{     
            Socket s=new Socket("localhost",6666); 

            DataOutputStream dout=new DataOutputStream(s.getOutputStream()); 
            Scanner read = new Scanner(System.in);
            System.out.println("Enter password :");
            String pass = read.nextLine();
            System.out.println("Enter string");

            String str = read.nextLine();
            String reverse = "";
            for(int i = str.length() - 1; i >= 0; i--)
            {
                reverse = reverse + str.charAt(i);
            }
            dout.writeUTF(reverse);
            dout.writeUTF(pass); 
            dout.flush(); 
            dout.close(); 
            s.close(); 
        }catch(Exception e)
        {
            System.out.println(e);} 
    } 
} 