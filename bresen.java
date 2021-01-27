import java.io.*;
class bresen
{public static void main(String args[])throws IOException
    {DataInputStream in = new DataInputStream(System.in);
        System.out.println("enter values x0 y0 x1 y1  **x1 must be greater than x0 ");
        int x0=Integer.parseInt(in.readLine());
         int y0=Integer.parseInt(in.readLine());
          int x1=Integer.parseInt(in.readLine());
           int y1=Integer.parseInt(in.readLine());
           int dx=x1-x0;
           int dy=y1-y0;
           int p=2*dy-dx;
           int x=x0,y=y0;
           System.out.println("\tk \tpk \txk+1 \tyk+1");
           for(int i=0;i<dx;i++)
           {   if(i==0)
               {if(p<0)
               {x=x+1;
                  
                }
                else
                { x=x+1;
                    y=y+1;
                }
                }
               
               else if(p<0)
               {x=x+1;
                   p=p+(2*dy);
                }
                else
                { x=x+1;
                    y=y+1;
                    p=p+((2*dy)-(2*dx));
                }
               
               System.out.println("\t"+i+"\t"+p+"\t"+x+"\t"+y);               
            }
           
        
    }
}
