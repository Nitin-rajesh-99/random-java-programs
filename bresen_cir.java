import java.io.*;
class bresen_cir
{public static void main(String args[])throws IOException
    {DataInputStream in = new DataInputStream(System.in);
        System.out.println("enter radius and xc yc");
        int r=Integer.parseInt(in.readLine());
        int xc=Integer.parseInt(in.readLine());
        int yc=Integer.parseInt(in.readLine());

        int p=3-(2*r);
        int x=0;
        int y=r;
        int count=0;
        System.out.println("\tpk\txk+1\tyk+1");
        do{if(count==0)
            { if(p<0)
            {//System.out.println("\t"+p+"\t"+x+"\t"+y);
                
                
                System.out.println("\t"+p+"\t"+x+"\t"+y);
                p=p+(4*x)+6;
                
            }  
             else
            {//System.out.println("\t"+p+"\t"+x+"\t"+y);
                
                System.out.println("\t"+p+"\t"+x+"\t"+y);
                p=p+(4*(x-y))+10;
            }
            }
            else
            if(p<0)
            {//System.out.println("\t"+p+"\t"+x+"\t"+y);
                x=x+1;
               
                System.out.println("\t"+p+"\t"+x+"\t"+y);
                 p=p+(4*x)+6;
            }    
            else
            {//System.out.println("\t"+p+"\t"+x+"\t"+y);
                x=x+1;
                y=y-1;
                 //p=p+(4*(x-y))+10;
                System.out.println("\t"+p+"\t"+x+"\t"+y);
                p=p+(4*(x-y))+10;
            }
            
            
            
            count++;
        }
        while(x<y);

    }
}
