import java.io.*;
import java.util.*;
class Repeated
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
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
            if(a[i]==a[j] && i!=j)
            {
                flag=1;
                n1=a[i];
                break;
            }
            }
        }  
            if(flag==1)
            {
                System.out.println(n1+" ");
            }
           else
           {
               System.out.println("no repeated element");
           }
        
    }
}
