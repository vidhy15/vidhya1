import java.io.*;
import java.util.*;
class StringInt
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        char ch[]=str.toCharArray();
        int x=0;
        for(int i=0;i<ch.length;i++)
        {  
            x=(int)ch[i];
            System.out.print(x);
        }
    }
}
