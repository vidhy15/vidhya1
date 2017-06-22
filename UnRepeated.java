import java.io.*;
import java.util.*;
class UnRepeated
{
    public static void main(String[] argsa)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int flag=0;
        int n1=0;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0,j=1;i<n;i=i+2,j=j+2)
        {
           
            if(a[i]!=a[j] && i!=j)
            {
                flag=1;
                n1=a[i];
                break;
            }
            }
  
            if(flag==1)
            {
                System.out.println(n1+" ");
            }
           else
           {
               System.out.println("no unrepeated element");
           }
        
    }
}
