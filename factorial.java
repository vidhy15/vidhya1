import java.io.*;
import java.util.*;
class factorial
{
    public static void main(String [] a)
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int r=1;
       for(int i=n;i>0;i--)
        {
            r=i*r;
        }
        System.out.println(r);
    }  
}

