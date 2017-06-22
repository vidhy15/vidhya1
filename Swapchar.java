import java.io.*;
import java.util.*;
class Swapchar
{
    public static void main(String[] argsa)
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        char ch[]=str.toCharArray();
        int l=ch.length;
        for(int i=0;i<l;i=i+2)
        {
            if(l%2==0)
            {
            char c=ch[i];
            ch[i]=ch[i+1];
            ch[i+1]=c;
            }
        }
            System.out.println(ch);
    }
}
