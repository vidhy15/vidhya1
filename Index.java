import java.io.*;
import java.util.*;
class Index
{
    public static void main(String[] argsa)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int flag=0;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]==i)
            {
               //flag=1;
            System.out.println(i);
            }
        }
    }
}
