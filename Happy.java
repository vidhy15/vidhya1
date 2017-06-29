import java.io.*;
import java.util.*;
import java.lang.*;
class Happy
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int s=0,r=0;
        while(n>1)
        {
            r=n%10;
            s=s/10;
            n=(r*r)+(s*s);
        }
            if(n==1)
            {
                System.out.println("HAPPY NUMBER");
            }
            else{
                System.out.println("NO HAPPY NUMBER");
            }
        
    }
}
