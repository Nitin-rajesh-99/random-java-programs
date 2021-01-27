import java.io.*;
class midpoint
{public static void main(String args[])throws IOException
    {DataInputStream in = new DataInputStream(System.in);
        System.out.println("enter radius and xc yc");
        int r=Integer.parseInt(in.readLine());
        int xc=Integer.parseInt(in.readLine());
        int yc=Integer.parseInt(in.readLine());

        int p=1-r;
        int x=0;
        int y=r;
        int count=0;
        System.out.println("\tpk\txk+1\tyk+1");
        do{if(p<0)
            {//System.out.println("\t"+p+"\t"+x+"\t"+y);
                x=x+1;
                System.out.println("\t"+p+"\t"+x+"\t"+y);
                p=p+(2*x)+1;
            }    
            else
            {//System.out.println("\t"+p+"\t"+x+"\t"+y);
                x=x+1;
                y=y-1;
                System.out.println("\t"+p+"\t"+x+"\t"+y);
                p=p+(2*x)+1-(2*y);
            }
            
            
            
            count++;
        }
        while(x<y);

    }
}
