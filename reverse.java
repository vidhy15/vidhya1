import java.io.*;
import java.util.*;
class reverse
{
    public static void main(String [] a)
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int r=0,t=0;
        while(n>0)
        {
        r=n%10;
        t=(t*10)+r;
        n=n/10;
        }
      System.out.println(t);  
    }
}

