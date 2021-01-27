import java.io.*; 
import java.net.*; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException; 
public class file_server_tcp { 
    public static void main(String[] args)throws IOException
    { try{ 
            ServerSocket ss=new ServerSocket(6666); 
            Socket s=ss.accept();//establishes connection  
            ServerSocket cc=new ServerSocket(6667); 
            Socket c=cc.accept();//establishes connection  
            DataInputStream dis=new DataInputStream(s.getInputStream());
            DataOutputStream dout=new DataOutputStream(c.getOutputStream());
            String  str=(String)dis.readUTF();      
            int ch; 
            String contents="";
            FileReader fr=null; 
            try
            { 
                fr = new FileReader(str); 
            } 
            catch (FileNotFoundException fe) 
            { 
                System.out.println("File not found"); 
            } 
            while ((ch=fr.read())!=-1) 
            {
                contents=contents+ (char)ch; 

            } 
            int pid=0; 
           // pid=ProcessHandle.current().pid();//only works on jdk 9and above
            String p=Long.toString(pid);
            dout.writeUTF(p);
            dout.writeUTF(contents); 
            dout.flush(); 
            dout.close(); 
        }catch(Exception e){System.out.println(e);} 
    } 
} 
