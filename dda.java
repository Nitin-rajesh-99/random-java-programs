import java.io.*;
class dda
{public static void main(String args[])throws IOException
    {DataInputStream in = new DataInputStream(System.in);
        System.out.println("enter values x0 y0 x1 y1");
        float x0=Float.parseFloat(in.readLine());
         float y0=Float.parseFloat(in.readLine());
          float x1=Float.parseFloat(in.readLine());
           float y1=Float.parseFloat(in.readLine());
           float dx=x1-x0;
           float dy=y1-y0;
           float m=dy/dx;
           float steps;
           if(dy>dx)
           {steps=dy;}
           else
           {steps=dx;}
           float xinc=dx/steps;
           float yinc=dy/steps;
           
           float x=x0;
           float y=y0;
           int xx,yy;
           System.out.println(dx);
           System.out.println(dy);
           System.out.println(m);
           System.out.println(steps);
           System.out.println(xinc);
           System.out.println(yinc);
           System.out.println("\tx\ty\tround(x)\tround(y)");
           for(int i=0;i<steps;i++)
           {   x=x+xinc;
               y=y+yinc;
               xx=Math.round(x);
               yy=Math.round(y);
               
               
               System.out.println("\t"+x+"\t"+y+"\t"+xx+"\t"+yy);               
            }
           
        
    }
}
